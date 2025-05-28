// JS Basics
console.log("Welcome to the Community Portal");
window.onload = () => alert("Page loaded successfully!");

// Form submission
function registerEvent(event) {
  event.preventDefault();
  document.getElementById("confirmation").textContent = "Registered successfully!";
}

// Phone validation
function validatePhone() {
  const phone = document.getElementById("phone").value;
  if (!/^\d{10}$/.test(phone)) {
    alert("Invalid phone number!");
  }
}

// Dropdown change
function showFee() {
  const value = document.getElementById("eventType").value;
  if (value) alert(`Selected event type: ${value}`);
  localStorage.setItem("preferredEvent", value);
}

// Character count
function countCharacters() {
  const msg = document.querySelector("textarea").value.length;
  console.log("Characters typed:", msg);
}

// Video ready
function videoReady() {
  document.getElementById("videoMsg").textContent = "Video ready to play!";
}

// Geolocation
function findEvents() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      position => {
        document.getElementById("locationOutput").textContent =
          `Lat: ${position.coords.latitude}, Lng: ${position.coords.longitude}`;
      },
      err => {
        document.getElementById("locationOutput").textContent =
          `Error: ${err.message}`;
      },
      { enableHighAccuracy: true, timeout: 10000 }
    );
  } else {
    alert("Geolocation not supported.");
  }
}

// Load preferred event
window.addEventListener("DOMContentLoaded", () => {
  const saved = localStorage.getItem("preferredEvent");
  if (saved) document.getElementById("eventType").value = saved;
});

// Clear preferences
function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  alert("Preferences cleared.");
}
