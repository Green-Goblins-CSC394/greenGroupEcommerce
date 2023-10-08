--Category
INSERT INTO "Category" ("category_id", "category_name") VALUES ('62ea3057-c4bb-4a68-97f0-5fe8ef697b78', 'Men');
INSERT INTO "Category" ("category_id", "category_name") VALUES ('a1c20845-273a-4bce-b3e0-0eae87bba8a6', 'Women');
INSERT INTO "Category" ("category_id", "category_name") VALUES ('538ad00d-d5f1-40aa-a512-27e537f59f5b', 'Kids');

--Products by Category
--Mens
INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '30be9575-bb98-44f1-8d29-c63cab6a4825',
  'Emerald',
  60.00,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78',
  '2023-10-07 16:03:45',
  '/images/menEmerald.avif',
  'A stylish men''s t-shirt in vibrant emerald green, perfect for adding a pop of color to your wardrobe.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '03fcdeaf-0007-4ffb-ba4f-f5dce011c330',
  'Forest',
  56.60,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78',
  '2023-10-07 16:03:45',
  '/images/menForest.jpg',
  'A classic men''s t-shirt in the deep and earthy shade of forest green, ideal for a nature-inspired look.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '16d3d766-92da-4d5a-af45-565e8e33691b',
  'Jade',
  58.75,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78',
  '2023-10-06 16:03:45',
  '/images/menJade.avif',
  'A sleek men''s t-shirt in the elegant hue of jade green, exuding a sense of sophistication and style.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'e13ba06f-c820-43e8-92ab-543f4fbc1290',
  'Kiwi',
  58.75,
  '62ea3057-c4bb-4a68-97f0-5fe8ef697b78',
  '2023-10-06 16:03:45',
  '/images/menKiwi.avif',
  'A lively men''s t-shirt in the refreshing shade of kiwi green, perfect for a vibrant and energetic look.'
  );

--Womens
INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'a03f78a5-559f-417f-b0dc-13711385811c',
  'Emerald',
  73.60,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6',
  '2023-10-07 16:15:45',
  '/images/womenEmerald.avif',
  'A chic women''s t-shirt in the luxurious emerald green shade, adding an elegant touch to any ensemble.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '07902a0a-aaf3-47a5-bc6a-06cfd30c6776',
  'Forest',
  46.50,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6',
  '2023-10-07 16:15:45',
  '/images/womenForest.jpg',
  'A timeless women''s t-shirt in the serene forest green, bringing a touch of nature''s beauty to your wardrobe.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '996bcdcf-fddf-4735-b615-02f399640b22',
  'Jade',
  52.30,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6',
  '2023-10-06 16:15:45',
  '/images/womenJade.avif',
  'An exquisite women''s t-shirt in the enchanting hue of jade green, embodying sophistication and charm.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  'd5a927c1-a712-42e7-be27-65d54771dc32',
  'Kiwi',
  52.30,
  'a1c20845-273a-4bce-b3e0-0eae87bba8a6',
  '2023-10-06 16:15:45',
  '/images/womenKiwi.avif',
  'A vibrant women''s t-shirt in the playful and refreshing color of kiwi green, adding a burst of energy to your look.'
  );

--Kids
INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '7771a8c5-5f9c-4db0-8d26-36c1726e21c1',
  'Emerald',
  30.30,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b',
  '2023-10-05 16:15:45',
  '/images/kidsEmerald.avif',
  'A delightful kid''s t-shirt in the enchanting emerald green, perfect for adding a touch of magic to their wardrobe.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '0aae253a-a71b-4ac3-90dc-cbeaa73694e1',
  'Forest',
  35.60,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b',
  '2023-10-07 16:15:45',
  '/images/kidsForest.jpg',
  'A charming kid''s t-shirt in the serene forest green, ideal for young adventurers exploring the great outdoors.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '6f4dd0fc-e69a-46f7-82cc-229b45ab480b',
  'Jade',
  32.25,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b',
  '2023-10-07 16:15:45',
  '/images/kidsJade.avif',
  'An adorable kid''s t-shirt in the captivating shade of jade green, offering a touch of elegance to their playful attire.'
  );

INSERT INTO "Products" ("product_id", "product_name", "price", "category_id", "created_at", "image_path", "description") 
VALUES (
  '5f2a1996-2f73-4475-9b7e-299d00de138b',
  'Kiwi',
  38.50,
  '538ad00d-d5f1-40aa-a512-27e537f59f5b',
  '2023-10-07 16:12:45',
  '/images/kidsKiwi.avif',
  'A fun and vibrant kid''s t-shirt in the lively kiwi green, perfect for adding a burst of energy to their outfits.'
  );

