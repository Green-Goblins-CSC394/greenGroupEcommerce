ALTER TABLE "Users" ALTER COLUMN "email" TYPE varchar(100);
ALTER TABLE "Users" ALTER COLUMN "password" TYPE varchar(100);

--Users
INSERT INTO "Users" ("user_id", "email", "password", "created_at", "last_login") 
VALUES (
  '57b7a9b0-9d5b-4760-a045-a53e169ce22c',
  'peter_parker@friendlyneighborhood.com',
  --password: spiderman
  '$2a$10$uH9JxwL9sKc8o1bXuuT1uu4P303pQccuFoMykCtaRrBMn4w9djOB6',
  '2023-01-02 12:43:23',
  '2023-10-15 12:03:45'
  );

INSERT INTO "Users" ("user_id", "email", "password", "created_at", "last_login") 
VALUES (
  'e29a7f3d-5121-4799-865c-d5baaf024357',
  'norman_osborn@oscorp.com',
  --password: spidermansucks
  '$2a$10$c/ZPU0YDjjxWnPOeABl8/.FwHKkGT3c8E1CbLkwiqn8JTEsxg3R0C',
  '2022-01-01 07:43:23',
  '2023-10-17 09:25:31'
  );

INSERT INTO "Users" ("user_id", "email", "password", "created_at", "last_login") 
VALUES (
  '0e4308d0-c0aa-4857-8dc3-ad52201ad203',
  'jj.jameson@dailybugle.com',
  --password: spidermenace
  '$2a$10$CaHEmp8.U8nXqM29U8675.R.NcPR8NX7PkFE8QKwFFYYSEoIGdeuC',
  '2022-03-11 11:14:52',
  '2023-06-17 13:41:27'
  );