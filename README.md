
## REST interface:
### Add Product to Basket:
Endpoint: POST /baskets/{userId}/products
Description: Adds a product to the user's basket.
Request Body: Product details (e.g., product ID, quantity).
Response: Confirmation or error message.

### Get Basket:
Endpoint: GET /baskets/{userId}
Description: Retrieves the contents of the user's basket.
Response: Basket details, including a list of products.

### Update Basket product:
Endpoint: PUT /baskets/{userId}/products/{productId}
Description: Updates the quantity or other details of a specific product in the basket.
Request Body: Updated product details.
Response: Confirmation or error message.

### Remove product from Basket:
Endpoint: DELETE /baskets/{userId}/products/{productId}
Description: Removes a specific product from the user's basket.
Response: Confirmation or error message.

### Clear Basket:
Endpoint: DELETE /baskets/{userId}
Description: Clears all products from the user's basket.
Response: Confirmation or error message.