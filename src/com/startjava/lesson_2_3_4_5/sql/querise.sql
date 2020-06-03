\connect jaeger;

-- �������� ��� �������
SELECT * FROM jaegers;

-- ���������� ������ �� ������������ �������
SELECT * FROM jaegers WHERE status != 'destroyed';

-- ���������� ������� ���������� �����, �������� Mark-1 � Mark-6
SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- ������������ ������� �� �������� �� ������� mark
SELECT * FROM jaegers ORDER BY mark DESC;

-- ���������� ������ ������� ������
SELECT * FROM jaegers ORDER BY launch LIMIT 1;

-- ���������� �������, ������� ���������� ������/������ ���� kaiju
SELECT * FROM jaegers WHERE kajuKill = (SELECT MAX(kajuKill) FROM jaegers);
SELECT * FROM jaegers WHERE kajuKill = (SELECT MIN(kajuKill) FROM jaegers);

-- ���������� ������� ��� �������
SELECT AVG(weight) FROM jaegers;

-- ��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������
UPDATE jaegers SET kajuKill = kajuKill + 1 WHERE status != 'destroyed';

-- ������� ������������ �������
DELETE FROM jaegers WHERE status = 'destroyed';