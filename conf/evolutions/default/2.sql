# member schema

# --- !Ups
CREATE TABLE member (
  id int AUTO_INCREMENT,
  account_id int NOT NULL,
  faction_id int NOT NULL,
  room_id int NOT NULL,
  name varchar(128) NOT NULL,
  image varchar(256),
  PRIMARY KEY (id),
  INDEX idx_account(account_id, faction_id)
);

# --- !Downs
DROP TABLE member;