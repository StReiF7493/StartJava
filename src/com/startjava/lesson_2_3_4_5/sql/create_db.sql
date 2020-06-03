CREATE DATABASE "jaeger";

\connect jaegers;

CREATE TABLE IF NOT EXISTS "jaegers" (
	id			SERIAL		PRIMARY KEY,
	modelName	TEXT		UNIQUE NOT NULL,
	mark 		TEXT		NOT NULL,
	height		INTEGER		NOT NULL,
	weight		INTEGER		NOT NULL,
	status 		TEXT		NOT NULL,
	origin 		TEXT		NOT NULL,
	launch		TEXT		NOT NULL,
	kajuKill	INTEGER		NOT NULL
);