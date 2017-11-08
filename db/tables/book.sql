-- auto-generated definition
CREATE TABLE book
(
  id               BIGINT AUTO_INCREMENT
    PRIMARY KEY,
  name             VARCHAR(45)        NOT NULL,
  content          LONGBLOB           NULL,
  page_count       INT                NOT NULL,
  isbn             VARCHAR(100)       NOT NULL,
  genre_id         BIGINT             NOT NULL,
  author_id        BIGINT             NOT NULL,
  publish_year     INT                NOT NULL,
  publisher_id     BIGINT             NOT NULL,
  image            LONGBLOB           NULL,
  avg_rating       INT(5) DEFAULT '0' NULL,
  total_vote_count BIGINT DEFAULT '0' NULL,
  total_rating     BIGINT DEFAULT '0' NULL,
  view_count       BIGINT DEFAULT '0' NULL,
  descr            VARCHAR(500)       NULL,
  CONSTRAINT id_UNIQUE
  UNIQUE (id),
  CONSTRAINT isbn_UNIQUE
  UNIQUE (isbn),
  CONSTRAINT fk_genre
  FOREIGN KEY (genre_id) REFERENCES genre (id)
    ON UPDATE CASCADE,
  CONSTRAINT fk_author
  FOREIGN KEY (author_id) REFERENCES author (id)
    ON UPDATE CASCADE,
  CONSTRAINT fk_publisher
  FOREIGN KEY (publisher_id) REFERENCES publisher (id)
);
CREATE INDEX fk_author_idx
  ON book (author_id);
CREATE INDEX fk_genre_idx
  ON book (genre_id);
CREATE INDEX fk_publisher_idx
  ON book (publisher_id);
