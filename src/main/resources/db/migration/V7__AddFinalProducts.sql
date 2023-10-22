--Remove all old products
DELETE FROM "Products";

--New Products by Category
--Mens
INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '84c6a50d-aee8-4d48-b284-a0986c644e85', --product_id (uniqueID)
  'Avengers',
  36.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-16 21:03:45', --created_at timestamp
  '/images/men-1.png', --image_path (don't forget preceding '/' for explicit pathing)
  'A stylish Men''s black graphic tee, inspired by your favorite Marvel comics.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '0a1a5f5f-097f-485e-b97d-17aaab5a6db4', --product_id (uniqueID)
  'Wolverine',
  36.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-10 16:03:45', --created_at timestamp
  '/images/men-2.png', --image_path (don't forget preceding '/' for explicit pathing)
  'A vintage Men''s black graphic tee, influenced by this iconic superhero.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'cd12761a-d168-4021-b348-6b2556e6f39b', --product_id (uniqueID)
  'Anime',
  32.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-12 14:02:45', --created_at timestamp
  '/images/men-3.png', --image_path (don't forget preceding '/' for explicit pathing)
  'A comfortable Men''s black t-shirt to rock about one’s love for anime.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '54878d3b-651f-4356-85ac-a80736c985fe', --product_id (uniqueID)
  'Marvel',
  35.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-14 12:08:35', --created_at timestamp
  '/images/men-4.png', --image_path (don't forget preceding '/' for explicit pathing)
  'A classic Men''s black graphic tee with the iconic Marvel logo.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'd643dccb-8331-4703-b330-22fec35bf9cf', --product_id (uniqueID)
  'Batman',
  33.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-13 19:08:35', --created_at timestamp
  '/images/men-5.png', --image_path (don't forget preceding '/' for explicit pathing)
  'A cool Men''s black t-shirt with the iconic logo of the superhero Batman.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'ddba3c1d-f842-440d-8e7c-af0fec067581', --product_id (uniqueID)
  'Marvel Comics',
  36.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-14 15:08:35', --created_at timestamp
  '/images/men-6.png', --image_path (don't forget preceding '/' for explicit pathing)
  'A vintage-inspired  Men''s marvelous black t-shirt of the Marvel comic superheroes.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'bba341a8-108f-4562-9932-1dd9406764e4', --product_id (uniqueID)
  'Skull',
  30.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-11 12:08:35', --created_at timestamp
  '/images/men-7.png', --image_path (don't forget preceding '/' for explicit pathing)
  'An artistically colorful  Men''s grey graphic t-shirt of a paint splattered skull.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '9e04c071-7e30-440e-abe5-a1317a3e0f8d', --product_id (uniqueID)
  'Superman',
  33.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-10 17:08:35', --created_at timestamp
  '/images/men-7.png', --image_path (don't forget preceding '/' for explicit pathing)
  'An iconic  Men''s uperhero blue t-shirt of a fearless superhero.' );



--WOMENS 
INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'e591410b-a98c-4389-ae8b-e9bb6ade09ae', --product_id (uniqueID)
  'Mario & Co',
  24.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-10 17:08:35', --created_at timestamp
  '/images/women-1.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A vintage Women''s grey t-shirt of your favorite Mario game characters.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '66979c4f-050e-4658-9cdb-23266274552b', --product_id (uniqueID)
  'Marvel Heroes',
  25.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-10 17:08:35', --created_at timestamp
  '/images/women-2.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A spectacular Women''s  black t-shirt of the heroes of Marvel, inspiring you to be heroic like them.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '7dd008e9-2525-4489-80b5-cf37d9850e12', --product_id (uniqueID)
  'Princess Peach',
  24.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-12 12:08:35', --created_at timestamp
  '/images/women-3.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A cute Women''s pink tee with the iconic Princess Peach.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'fcfdcb75-38b7-4e64-b1f8-cbe3bd129336', --product_id (uniqueID)
  'She-Hulk',
  23.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-13 14:08:35', --created_at timestamp
  '/images/women-4.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A spunky Women''s grey t-shirt with Marvel''s bold She-Hulk.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '4e5feda8-89c7-4227-a52a-d0ae0f6c7474', --product_id (uniqueID)
  'Batman Classic',
  25.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-13 19:08:35', --created_at timestamp
  '/images/women-5.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A comfortable Women''sblack vintage t-shirt with the Batman logo.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '04b828bf-9b54-46ae-b84d-679637fe4981', --product_id (uniqueID)
  'Batman Classic',
  25.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-14 17:08:35', --created_at timestamp
  '/images/women-6.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A comfortable Women''s black vintage t-shirt with the Batman logo.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '0f6138b2-372e-4123-b7b5-009ffa361c35', --product_id (uniqueID)
  'Spiderman',
  23.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-16 22:08:35', --created_at timestamp
  '/images/women-7.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' An amazing Women''s white t-shirt with everyone’s favorite friendly neighborhood web-slinger.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'a949d5e3-f512-41ae-ad6a-c96f94a522c7', --product_id (uniqueID)
  'The Phantom',
  20.00,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-12 12:08:35', --created_at timestamp
  '/images/women-8.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A bold Women''s grey t-shirt with a well-established hero.' );




  --KIDS
INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '20b3a132-640f-4c36-9f4e-3dd2a308d93c', --product_id (uniqueID)
  'Sonic',
  17.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-10 17:08:35', --created_at timestamp
  '/images/kids-1.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A cool Kids'' blue and white tie-dye t-shirt with everyone’s favorite Sonic characters. ' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '12442bf0-508e-429a-b87a-ade22dcad2e1', --product_id (uniqueID)
  'Pikachu',
  16.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-10 17:08:35', --created_at timestamp
  '/images/kids-2.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A bold Kids'' black and yellow tee with an iconic anime character of Pikachu. ' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '4b8bf285-4875-4c0c-99a9-9883975773e5', --product_id (uniqueID)
  'Space Jam',
  13.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-11 15:08:35', --created_at timestamp
  '/images/kids-3.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A vintage Kids'' blue t-shirt of the two most iconic Looney Toons characters from their movie Space Jam. ' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'ca535e8e-0774-4dbb-b828-ac427308f378', --product_id (uniqueID)
  'Pennywise',
  16.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-12 13:08:35', --created_at timestamp
  '/images/kids-4.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A vintage-inspired Kids'' graphic tee of the iconic horror movie IT.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '37746b1a-2571-4d54-bc2a-a469aa0c5a82', --product_id (uniqueID)
  'Super Mario',
  17.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-14 17:08:35', --created_at timestamp
  '/images/kids-5.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A spectacular Kids'' graphic t-shirt featuring the beloved characters from Super Mario.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '28ef898c-9684-42ec-8cd6-ff001f7f7a41', --product_id (uniqueID)
  'King of Pop',
  16.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-12 10:08:35', --created_at timestamp
  '/images/kids-6.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A stunning Kids'' graphic t-shirt of the King of Pop, Michael Jackson.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'b60fc861-19b1-4066-9396-ffe3986d1f6d', --product_id (uniqueID)
  'Unspeakable',
  13.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-12 11:08:35', --created_at timestamp
  '/images/kids-7.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A colorful Kids'' black graphic t-shirt of unspeakable frog.' );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '6df59cf6-efaa-40a8-bbd6-885f1e39d297', --product_id (uniqueID)
  'Stitch',
  16.00,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b', --category_id (MUST MATCH EXISTING IDS)
  '2023-10-16 19:08:35', --created_at timestamp
  '/images/kids-8.png', --image_path (don't forget preceding '/' for explicit pathing)
  ' A charming Kids'' t-shirt of Disney''s favorite blue alien, Stitch.' );