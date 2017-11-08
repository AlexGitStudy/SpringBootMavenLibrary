-- auto-generated definition
CREATE TABLE vote
(
  id       BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  value    INT(5) DEFAULT '0' NULL,
  book_id  BIGINT             NOT NULL,
  username VARCHAR(100)       NOT NULL,
  CONSTRAINT id_UNIQUE
  UNIQUE (id),
  CONSTRAINT fk_book_id
  FOREIGN KEY (book_id) REFERENCES book (id)
    ON DELETE CASCADE
);
CREATE INDEX fk_book_id_idx
  ON vote (book_id);
CREATE INDEX fk_user_id_idx
  ON vote (username);
