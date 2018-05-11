CREATE TABLE events (
  id int PRIMARY KEY,
  description VARCHAR,
  origaniser VARCHAR,
  start_time datetime,
);

CREATE TABLE events (
  id                     SERIAL PRIMARY KEY,
  user_id                INTEGER                  NOT NULL REFERENCES users (user_id),
  integrated_solution_id INTEGER                  NOT NULL REFERENCES integrated_solutions (id),
  role                   VARCHAR,
  created_at             TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT now(),
  updated_at             TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT now(),
  created_by             VARCHAR,
  updated_by             VARCHAR
);

