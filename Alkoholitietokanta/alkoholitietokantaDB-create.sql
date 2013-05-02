create table baari (
  nimi                      varchar(255) primary key,
  kuvaus                    varchar(255))
;

create table baari_reissu (
  id                        integer primary key AUTOINCREMENT,
  baarin_nimi               varchar(255),
  kuvaus                    varchar(255))
;

create table juoma (
  id                        integer primary key AUTOINCREMENT,
  name                      varchar(255),
  juoman_kuvaus             varchar(255),
  lisaaja                   varchar(255),
  juoman_alkoholiprosentti  double)
;

create table juoma_tilaus (
  id                        integer primary key AUTOINCREMENT,
  juoma_id                  integer,
  maara                     integer,
  baari_reissu_id           integer)
;

create table kayttaja (
  tunnus                    varchar(255) primary key,
  salasana                  varchar(255))
;

create table ryyppy_reissu (
  ryyppy_reissun_nimi       varchar(255) primary key)
;

create index ix_juoma_tilaus_juoma_1 on juoma_tilaus (juoma_id);
create index ix_juoma_tilaus_baariReissu_2 on juoma_tilaus (baari_reissu_id);


