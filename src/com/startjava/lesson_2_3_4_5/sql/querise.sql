\connect jaeger;

-- выведите всю таблицу
SELECT * FROM jaegers;

-- отобразите только не уничтоженных роботов
SELECT * FROM jaegers WHERE status != 'destroyed';

-- отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jaegers ORDER BY mark DESC;

-- отобразите самого старого робота
SELECT * FROM jaegers ORDER BY launch LIMIT 1;

-- отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM jaegers WHERE kajuKill = (SELECT MAX(kajuKill) FROM jaegers);
SELECT * FROM jaegers WHERE kajuKill = (SELECT MIN(kajuKill) FROM jaegers);

-- отобразите средний вес роботов
SELECT AVG(weight) FROM jaegers;

-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers SET kajuKill = kajuKill + 1 WHERE status != 'destroyed';

-- удалите уничтоженных роботов
DELETE FROM jaegers WHERE status = 'destroyed';