-- DECRIPTION:
-- Используя данное описание базы данных решить задания https://disk.yandex.ru/i/GljJJ--husu2jg

-- SOLUTION:

-- 1. Найти самый дорогой товар. Вывести имя товара и его цену
SELECT G.name, P.value
    FROM Goods G
    JOIN Prices P ON G.id = P.goods_id
    WHERE P.value = (SELECT MAX(value)
                            FROM Prices);
							
-- 2. Найти товары с нулевым остатком. Вывести имя товара и его цену
SELECT G.name, P.value
    FROM Goods G
    LEFT JOIN Prices P ON G.id = P.goods_id
    LEFT JOIN Quantity Q ON G.id = Q.goods_id
    WHERE Q.value = 0 OR Q.value is NULL
	
-- 3. Найти производителя с самой большой средней ценой за товары. Вывести имя производителя и среднюю стоимость
SELECT M.name, AVG(P.value)
    FROM Manufacturer M
    JOIN Suppliers S ON M.id = S.manufacturer_id
    JOIN Goods G ON S.id = G.supplier_id
    JOIN Prices P ON G.id = P.goods_id
    GROUP BY M.name
    HAVING AVG(P.value) >= ALL(SELECT AVG(P.value)
                                   FROM Manufacturer M
                                   JOIN Suppliers S ON M.id = S.manufacturer_id
                                   JOIN Goods G ON S.id = G.supplier_id
                                   JOIN Prices P ON G.id = P.goods_id
                                   GROUP BY M.name);
									  
-- 4. Найти все товары производителей из Москвы. Вывести имена товаров, их цены и имена производителей
SELECT G.name, P.value, M.name
       FROM Manufacturer M
       JOIN Suppliers S ON M.id = S.manufacturer_id
       JOIN Goods G ON S.id = G.supplier_id
       LEFT JOIN Prices P ON G.id = P.goods_id
       WHERE M.location = 'Moscow'