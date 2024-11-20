let cartCount = 0;
let cartItems = [];

document.querySelectorAll('.add-to-cart').forEach(button => {
    button.addEventListener('click', () => {
        const product = button.getAttribute('data-product');
        cartItems.push(product);
        cartCount++;
        document.getElementById('cart-count').innerText = cartCount;
        alert(`${product} has been added to your cart!`);
    });
});

document.getElementById('view-cart').addEventListener('click', () => {
    const cartModal = document.getElementById('cart-modal');
    const cartItemsList = document.getElementById('cart-items');
    const totalItems = document.getElementById('total-items');

    // // Clear previous items
    // cartItemsList

        // Clear previous items
        cartItemsList.innerHTML = '';
    
        // Populate the cart items
        cartItems.forEach(item => {
            const li = document.createElement('li');
            li.textContent = item;
            cartItemsList.appendChild(li);
        });
    
        // Update total items in the cart
        totalItems.textContent = `Total items in cart: ${cartCount}`;
        
        // Show the modal
        cartModal.style.display = "block";
    });
    
    // Close the modal when the user clicks on <span> (x)
    document.querySelector('.close').addEventListener('click', () => {
        document.getElementById('cart-modal').style.display = "none";
    });
    
    // Close the modal when the user clicks anywhere outside of the modal
    window.addEventListener('click', (event) => {
        const cartModal = document.getElementById('cart-modal');
        if (event.target === cartModal) {
            cartModal.style.display = "none";
        }
    });
    
