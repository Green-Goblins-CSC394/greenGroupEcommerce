CREATE TABLE "Users" (
  "user_id" UUID PRIMARY KEY,
  "email" varchar(30),
  "password" varchar(20),
  "created_at" timestamp,
  "last_login" timestamp
);

CREATE TABLE "Category" (
  "category_id" UUID PRIMARY KEY,
  "category_name" varchar(15)
);

CREATE TABLE "Cart" (
  "cart_id" UUID,
  "user_id" UUID,
  "cart_item_id" UUID,
  "quantity" SMALLINT,
  "product_id" UUID,
  "created_at" timestamp,
  PRIMARY KEY ("cart_id", "cart_item_id")
);

CREATE TABLE "Inventory" (
  "inventory_id" UUID,
  "size" varchar(2),
  "remaining_stock" SMALLINT,
  "product_id" UUID
);

CREATE TABLE "Products" (
  "product_id" UUID PRIMARY KEY,
  "product_name" varchar(30),
  "price" numeric(10,2),
  "category_id" UUID,
  "created_at" timestamp
);

CREATE TABLE "Orders" (
  "order_id" UUID PRIMARY KEY,
  "user_id" UUID,
  "transaction_price" numeric(12,2),
  "tracking_number" varchar(40),
  "completed_at" timestamp
);

ALTER TABLE "Products" ADD FOREIGN KEY ("category_id") REFERENCES "Category" ("category_id");

ALTER TABLE "Orders" ADD FOREIGN KEY ("user_id") REFERENCES "Users" ("user_id");

ALTER TABLE "Inventory" ADD FOREIGN KEY ("product_id") REFERENCES "Products" ("product_id");

ALTER TABLE "Cart" ADD FOREIGN KEY ("user_id") REFERENCES "Users" ("user_id");

ALTER TABLE "Cart" ADD FOREIGN KEY ("product_id") REFERENCES "Products" ("product_id");