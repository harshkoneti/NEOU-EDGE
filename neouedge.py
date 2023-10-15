
import random
import string
import sqlite3

# Function to generate a random alphanumeric Product Name
def generate_product_name():
    return ''.join(random.choices(string.ascii_letters + string.digits, k=5))

# Function to generate a random Stock_On_Hand value between 20 and 50
def generate_stock_on_hand():
    return random.randint(20, 50)

# Create a SQLite database and table to store product data
conn = sqlite3.connect('product_data.db')
cursor = conn.cursor()
cursor.execute('''CREATE TABLE IF NOT EXISTS products
                  (id INTEGER PRIMARY KEY,
                   product_name TEXT,
                   stock_on_hand INTEGER)''')
conn.commit()

# Function to insert 50 unique products into the database
def insert_products():
    product_names = set()
    while len(product_names) < 50:
        product_name = generate_product_name()
        if product_name not in product_names:
            product_names.add(product_name)
            stock_on_hand = generate_stock_on_hand()
            cursor.execute("INSERT INTO products (product_name, stock_on_hand) VALUES (?, ?)",
                           (product_name, stock_on_hand))
    conn.commit()

# Function to retrieve and display product data
def display_products(page=1):
    records_per_page = 20
    offset = (page - 1) * records_per_page
    cursor.execute("SELECT product_name, stock_on_hand FROM products LIMIT ? OFFSET ?",
                   (records_per_page, offset))
    products = cursor.fetchall()
    for product in products:
        print(f"Product Name: {product[0]}, Stock On Hand: {product[1]}")

# Button 1: Sort ascending by Product Name
def sort_ascending():
    cursor.execute("SELECT product_name, stock_on_hand FROM products ORDER BY product_name ASC")
    products = cursor.fetchall()
    for product in products:
        print(f"Product Name: {product[0]}, Stock On Hand: {product[1]}")

# Button 2: Sort descending by Stock On Hand
def sort_descending():
    cursor.execute("SELECT product_name, stock_on_hand FROM products ORDER BY stock_on_hand DESC")
    products = cursor.fetchall()
    for product in products:
        print(f"Product Name: {product[0]}, Stock On Hand: {product[1]}")

# Button 3: Reduce Stock_On_Hand by 2 for every product
def reduce_stock():
    cursor.execute("UPDATE products SET stock_on_hand = stock_on_hand - 2")
    conn.commit()

# Button 4: Increase Stock_On_Hand by 2 for products with even-numbered names
def increase_stock_for_even_names():
    cursor.execute("UPDATE products SET stock_on_hand = stock_on_hand + 2 WHERE id % 2 == 0 AND stock_on_hand > 0")
    conn.commit()

# Sample usage:
insert_products()  # Insert 50 unique products into the database
display_products(1)  # Display the first 20 products
sort_ascending()  # Sort products by name in ascending order
sort_descending()  # Sort products by stock on hand in descending order
reduce_stock()  # Reduce stock for all products by 2
increase_stock_for_even_names()  # Increase stock for products with even-numbered names by 2