# token schema

# --- !Ups
CREATE TABLE token (
  id int AUTO_INCREMENT,
  token varchar(128) NOT NULL,
  PRIMARY KEY (id),
  INDEX idx_token(token)
);

# --- !Downs
DROP TABLE token;