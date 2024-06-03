const products = [
    { name: "Product 1", price: 10, image: "product1.jpg" },
    { name: "Product 2", price: 20, image: "product2.jpg" },
    { name: "Product 3", price: 30, image: "product3.jpg" }
  ];
  
  const productsContainer = document.getElementById("products");
  
  function displayProducts() {
    products.forEach(product => {
      const productDiv = document.createElement("div");
      productDiv.classList.add("product");
      productDiv.innerHTML = `
        <img src="${product.image}" alt="${product.name}">
        <h2>${product.name}</h2>
        <p>$${product.price}</p>
        <button onclick="addToCart('${product.name}', ${product.price})">Add to Cart</button>
      `;
      productsContainer.appendChild(productDiv);
    });
  }
  
  function addToCart(name, price) {
    alert(`Added ${name} to cart for $${price}`);
  }
  
  displayProducts();
  
  
  