-- Last updated: 09/07/2026, 15:06:59
# Write your MySQL query statement below
SELECT product_id , year as first_year , quantity , price
FROM Sales
WHERE (product_id,year) IN (
    SELECT product_id , MIN(year)
    FROM sales
    GROUP BY product_id
    )

