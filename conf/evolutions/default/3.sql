# faction schema

# --- !Ups
CREATE TABLE faction (
  id int AUTO_INCREMENT,
  name varchar(128) NOT NULL,
  PRIMARY KEY (id)
);

# --- !Downs
DROP TABLE faction;