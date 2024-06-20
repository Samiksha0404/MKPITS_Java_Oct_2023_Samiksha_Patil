CREATE TABLE banking.accounts (
  id INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL,
  user_name VARCHAR(30) NOT NULL,
  account_type VARCHAR(10) NOT NULL,
  rate_of_intrest DOUBLE NOT NULL,
  balance DOUBLE NOT NULL,
  created_by INT NULL,
  created_at DATETIME NULL,
  updated_by INT NULL,
  updated_at DATETIME NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX user_name_UNIQUE (user_name ASC) VISIBLE,
  INDEX Acc_Users_FK_idx (user_id ASC) VISIBLE,
  CONSTRAINT Acc_Users_FK
    FOREIGN KEY (user_id)
    REFERENCES banking.users (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);