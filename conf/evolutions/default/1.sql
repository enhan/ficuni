# --- !Ups

CREATE SEQUENCE internship_type_id_seq;

CREATE TABLE internship_type (
    id integer not null default nextVal('internship_type_id_seq'),
    title varchar(255),
    description varchar(1024)
);

# --- !Downs
DROP TABLE internship_type;
DROP SEQUENCE internship_type_id_seq;
