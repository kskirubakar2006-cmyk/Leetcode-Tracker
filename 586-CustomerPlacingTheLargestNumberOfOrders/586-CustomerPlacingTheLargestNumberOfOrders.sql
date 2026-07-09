-- Last updated: 09/07/2026, 15:07:27
SELECT customer_number
  FROM Orders
 GROUP BY customer_number
 ORDER BY count(*) DESC
 LIMIT 1; 