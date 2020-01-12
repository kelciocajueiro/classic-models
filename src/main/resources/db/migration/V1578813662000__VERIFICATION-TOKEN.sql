CREATE TABLE IF NOT EXISTS `classicmodels`.`verificationtoken` (
  `id`          integer      NOT NULL,
  `token`       varchar(255) NULL,
  `expiryDate`  datetime     NOT NULL,
  `userId`      int          NOT NULL,
  `createdOn`   datetime     NOT NULL,
  `updatedOn`   datetime     NOT NULL,
  `version`     int          NOT NULL,
  INDEX `USER_ID_IDX` (`userId` ASC),
  PRIMARY KEY (`id`),
  CONSTRAINT `userId`
  FOREIGN KEY (`userId`)
  REFERENCES `classicmodels`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1;