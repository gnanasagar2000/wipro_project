const user = {
    name: 'John Doe',
    email: 'john@example.com',
    age: 30
  };
  function changeName(newName) {
    user.name = newName;
  }
  function updateEmail(newEmail) {
    user.email = newEmail;
  }
  function calculateBirthYear() {
    const currentYear = new Date().getFullYear();
    return currentYear - user.age;
  }
  
  console.log("User's current name:", user.name);
  changeName('Jane Smith');
  console.log("User's updated name:", user.name);
  
  console.log("User's current email:", user.email);
  updateEmail('jane@example.com');
  console.log("User's updated email:", user.email);
  
  console.log("User's birth year:", calculateBirthYear());
  
  
  