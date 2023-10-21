CREATE TABLE "OrderItems" (
  --won't be used but required
  "order_item_id" UUID PRIMARY KEY,
  "order_id" UUID,
  "product_id" UUID,
  "quantity" SMALLINT,
  "size" varchar(2)
);

ALTER TABLE "OrderItems" ADD FOREIGN KEY ("order_id") REFERENCES "Orders" ("order_id");
ALTER TABLE "OrderItems" ADD FOREIGN KEY ("product_id") REFERENCES "Products" ("product_id");