-- 코드를 입력하세요
SELECT LEFT(PRODUCT_CODE, 2) as CATEGORY, count(PRODUCT_CODE) as PRODUCTS
FROM PRODUCT
group by (left(PRODUCT_CODE, 2))
order by PRODUCT_CODE