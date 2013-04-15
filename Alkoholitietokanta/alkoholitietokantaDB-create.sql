create table baari (
  nimi                      varchar(255) primary key,
  kuvaus                    varchar(255))
;

create table baari_reissu (
  id                        integer primary key AUTOINCREMENT,
  baarin_nimi               varchar(255))
;

create table juoma (
  id                        integer primary key AUTOINCREMENT,
  name                      varchar(255),
  juoman_kuvaus             varchar(255),
  lisaaja                   varchar(255),
  juoman_alkoholiprosentti  double)
;

create table kayttaja (
  tunnus                    varchar(255) primary key,
  salasana                  varchar(255))
;

create table ryyppy_reissu (
  ryyppy_reissun_nimi       varchar(255) primary key)
;



