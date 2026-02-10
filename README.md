# 🛠️ Handmade-Java: Data Structures from Scratch

A personal project dedicated to implementing core data structures from the ground up using **Java**. The goal is to deeply understand the internal mechanics of data structures without relying on built-in libraries.

## Progress Tracker

### 1. Linear Data Structures
- [x] [**MyArrayList**](./src/linear/MyArrayList.java): Dynamic Array implementation
    - Key Features: Automatic resizing (`grow()`), shift logic for element removal.
- [ ] **MyLinkedList**: Singly Linked List (Coming Soon)
- [ ] **Stack & Queue**: LIFO/FIFO structures (Coming Soon)

## Implementation Logs

### MyArrayList (Dynamic Array)
- **Core Functionalities**:
    - **Generics (`T`)**: Supports any object type for reusability.
    - **Dynamic Resizing**: Automatically doubles the internal capacity when the array is full.
    - **Continuous Storage**: Implements shifting logic in `remove(int index)` to maintain data integrity.
- **Key Takeaways**:
    - Overcoming the fixed-size limitation of primitive arrays.
    - Understanding memory management and the importance of `null` references for GC (Garbage Collection).
