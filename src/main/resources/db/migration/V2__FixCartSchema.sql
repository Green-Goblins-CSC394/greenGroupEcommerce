-- Fix Cart
ALTER TABLE "Cart" DROP CONSTRAINT "Cart_pkey";
ALTER TABLE "Cart" ADD PRIMARY KEY ("cart_id");
ALTER TABLE "Cart" DROP COLUMN "cart_item_id";
ALTER TABLE "Cart" DROP COLUMN "created_at";
ALTER TABLE "Cart" ADD COLUMN "size" varchar(2);


