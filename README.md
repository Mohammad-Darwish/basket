
## REST interface:
### Add Item to Basket:
Endpoint: POST /baskets/{userId}/items
Description: Adds a product to the user's basket.
Request Body: Product details (e.g., product ID, quantity).
Response: Confirmation or error message.

### Get Basket:
Endpoint: GET /baskets/{userId}
Description: Retrieves the contents of the user's basket.
Response: Basket details, including a list of items.

### Update Basket Item:
Endpoint: PUT /baskets/{userId}/items/{itemId}
Description: Updates the quantity or other details of a specific item in the basket.
Request Body: Updated item details.
Response: Confirmation or error message.

### Remove Item from Basket:
Endpoint: DELETE /baskets/{userId}/items/{itemId}
Description: Removes a specific item from the user's basket.
Response: Confirmation or error message.

### Clear Basket:
Endpoint: DELETE /baskets/{userId}
Description: Clears all items from the user's basket.
Response: Confirmation or error message.