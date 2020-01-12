CREATE TABLE IF NOT EXISTS `classicmodels`.`user` (
  `id`         integer      NOT NULL,
  `name`       varchar(100) NOT NULL,
  `email`      varchar(100) NOT NULL,
  `enabled`    boolean      NOT NULL,
  `createdOn`  datetime     NOT NULL,
  `updatedOn`  datetime     NOT NULL,
  `version`    int          NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `EMAIL_UNIQUE` (`email` ASC)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1;
