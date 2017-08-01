CREATE TABLE user_tb
(
  user_id serial NOT NULL,
  email text,
  region text,
  digest_type boolean,
  token text,
  confirm boolean,
  type text,
  CONSTRAINT user_tb_pkey PRIMARY KEY (user_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE user_tb
  OWNER TO postgres;

  CREATE TABLE news_tb
(
  news_id text NOT NULL,
  datetime timestamp without time zone,
  location text,
  newsurl text,
  text text,
  photolist text,
  title text,
  videourl text,
  region text,
  CONSTRAINT firstkey PRIMARY KEY (news_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE news_tb
  OWNER TO postgres;


  CREATE TABLE statistics
(
  num_total_news integer,
  num_us_news integer,
  num_africa_news integer,
  num_europe_news integer,
  num_asia_news integer,
  num_meast_news integer,
  num_lamerica_news integer,
  num_digest integer,
  num_ndigest integer,
  num_tweets integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE statistics
  OWNER TO postgres;