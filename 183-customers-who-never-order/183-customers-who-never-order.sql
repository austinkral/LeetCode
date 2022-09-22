# Write your MySQL query statement below
SELECT name as 'Customers' FROM customers
    LEFT JOIN orders ON (orders.customerId = customers.id)
        WHERE orders.id IS NULL;