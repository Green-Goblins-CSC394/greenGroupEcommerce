ALTER TABLE "Products" ADD COLUMN "stripe_product_id" varchar(20);

-- stripe product id's for kids products
UPDATE "Products" 
SET "stripe_product_id" = 'prod_OsDjvQ1olJ7etG' 
WHERE "product_id" = '20b3a132-640f-4c36-9f4e-3dd2a308d93c';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsDjWHEi393fxx'
WHERE "product_id" = '12442bf0-508e-429a-b87a-ade22dcad2e1';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsDj2ZLn7qWmJR'
WHERE "product_id" = '4b8bf285-4875-4c0c-99a9-9883975773e5';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsDkmGAugY1moH'
WHERE "product_id" = 'ca535e8e-0774-4dbb-b828-ac427308f378';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsDkhTKZa7u4Qt'
WHERE "product_id" = '37746b1a-2571-4d54-bc2a-a469aa0c5a82';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsDl6RJhNPT3Mr'
WHERE "product_id" = '28ef898c-9684-42ec-8cd6-ff001f7f7a41';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsDlrFyoib1aDJ'
WHERE "product_id" = 'b60fc861-19b1-4066-9396-ffe3986d1f6d';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsDloz8fsdrUhU'
WHERE "product_id" = '6df59cf6-efaa-40a8-bbd6-885f1e39d297';

-- stripe product ids for men's products
UPDATE "Products"
SET "stripe_product_id" = 'prod_OsCleC75DwBcTr'
WHERE "product_id" = '84c6a50d-aee8-4d48-b284-a0986c644e85';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsCmX7uiAGqdIb'
WHERE "product_id" = '0a1a5f5f-097f-485e-b97d-17aaab5a6db4';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsCm5K13i8wls4'
WHERE "product_id" = 'cd12761a-d168-4021-b348-6b2556e6f39b';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsCn5QZyrKaQwp'
WHERE "product_id" = '54878d3b-651f-4356-85ac-a80736c985fe';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsCnOprxtTmGoX'
WHERE "product_id" = 'd643dccb-8331-4703-b330-22fec35bf9cf';

UPDATE "Products"
SET "stripe_product_id" = 'prod_OsCojd2RKbcM9w'
WHERE "product_id" = 'ddba3c1d-f842-440d-8e7c-af0fec067581';

UPDATE "Products"
SET "stripe_product_id"='prod_OsCopz2avUOpbZ' 
WHERE "product_id"='bba341a8108f456299321dd9406764e4'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsCofNfcoIFDWg' 
WHERE "product_id"='9e04c0717e30440eabe5a1317a3e0f8d'; 

-- stripe product id's for women's products
UPDATE "Products" 
SET "stripe_product_id"='prod_OsDgtuBbu2IUMq' 
WHERE "product_id"='e591410ba98c4389ae8be9bb6ade09ae'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsDhHVlNiJSpR0' 
WHERE "product_id"='66979c4f050e46589cdb23266274552b'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsDhthV86a22cZ' 
WHERE "product_id"='7dd008e92525448980b5cf37d9850e12'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsDhf7JmvlNVRl' 
WHERE "product_id"='fcfdcb7538b74e64b1f8cbe3bd129336'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsDhyoeS8AP2yD' 
WHERE "product_id"='4e5feda889c74227a52ad0ae0f6c7474'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsDiedOq9vzWmS' 
WHERE "product_id"='04b828bf9b5446aeb84d679637fe4981'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsDiOGU5ghyxcZ' 
WHERE "product_id"='0f6138b2372e4123b7b5009ffa361c35'; 

UPDATE "Products" 
SET "stripe_product_id"='prod_OsDiUtcnEcgsSx' 
WHERE "product_id"='a949d5e3f51241aead6ac96f94a522c7';
