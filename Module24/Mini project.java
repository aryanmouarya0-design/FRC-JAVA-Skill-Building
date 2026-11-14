import java.util.Scanner;
import java.util.ArrayList;

class miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = { "Milk", "Bread", "Eggs", "Rice" };
        int[] stock = { 10, 15, 20, 12 };

        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();

        int choice = 0;

        while (choice != 6) {
            System.out.println("\n GROCERY STORE ");
            System.out.println("1. View Inventory");
            System.out.println("2. Add to Cart");
            System.out.println("3. Remove from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Inventory ");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println((i + 1) + ". " + items[i] + " - Stock: " + stock[i]);
                    }
                    break;

                case 2:
                    System.out.println("\n Add Items ");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println((i + 1) + ". " + items[i] + " - Stock: " + stock[i]);
                    }

                    System.out.print("Enter item number: ");
                    int addItem = sc.nextInt();

                    if (addItem >= 1 && addItem <= items.length) {
                        int index = addItem - 1;

                        if (stock[index] > 0) {
                            int cartIndex = cart.indexOf(items[index]);

                            if (cartIndex == -1) {
                                cart.add(items[index]);
                                quantity.add(1);
                            } else {
                                quantity.set(cartIndex, quantity.get(cartIndex) + 1);
                            }

                            stock[index]--;
                            System.out.println(items[index] + " added to cart!");
                        } else {
                            System.out.println("Sorry! Item is out of stock.");
                        }
                    } else {
                        System.out.println("Invalid item number!");
                    }
                    break;

                case 3:
                    System.out.println("\nRemove Items ");
                    if (cart.size() == 0) {
                        System.out.println("Your cart is empty!");
                    } else {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println((i + 1) + ". " + cart.get(i) + " - Quantity: " + quantity.get(i));
                        }

                        System.out.print("Enter item number to remove: ");
                        int removeItem = sc.nextInt();

                        if (removeItem >= 1 && removeItem <= cart.size()) {
                            int index = removeItem - 1;
                            String removedItem = cart.get(index);

                            for (int i = 0; i < items.length; i++) {
                                if (items[i].equals(removedItem)) {
                                    stock[i]++;
                                    break;
                                }
                            }

                            if (quantity.get(index) > 1) {
                                quantity.set(index, quantity.get(index) - 1);
                            } else {
                                cart.remove(index);
                                quantity.remove(index);
                            }

                            System.out.println(removedItem + " removed from cart!");
                        } else {
                            System.out.println("Invalid item number!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nYour Shopping Cart ");
                    if (cart.size() == 0) {
                        System.out.println("Your cart is empty!");
                    } else {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println(cart.get(i) + " - Quantity: " + quantity.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nCHECKOUT ");
                    if (cart.size() == 0) {
                        System.out.println("Your cart is empty!");
                    } else {
                        int totalQuantity = 0;
                        System.out.println("Items Purchased:");

                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println(cart.get(i) + " - Quantity: " + quantity.get(i));
                            totalQuantity += quantity.get(i);
                        }

                        System.out.println("data");
                        System.out.println("Total Quantity: " + totalQuantity);

                        System.out.println("\nFinal Inventory ");
                        for (int i = 0; i < items.length; i++) {
                            System.out.println(items[i] + " - Remaining Stock: " + stock[i]);
                        }

                        System.out.println("\nThank you for shopping!");
                        cart.clear();
                        quantity.clear();
                    }
                    break;

                case 6:
                    System.out.println("\nThank you for visiting!");
                    System.out.println("Exiting Grocery Store...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
