package com.company;

public class Pizza {
        private String size;
        private int numToppings;
        private String discountCode;

        public Pizza() {
            this.size = "S";
            this.numToppings = 0;
            this.discountCode = "";
        }

        public Pizza(String inSize, int inNumToppings, String inDiscountCode) {
            this.size = inSize;
            this.numToppings = inNumToppings;
            this.discountCode = inDiscountCode;
        }

        public void setSize(String newSize) {
            this.size = newSize;
        }

        public void setNumToppings(int newNumToppings) {
            this.numToppings = newNumToppings;
        }

        public void setDiscountCode(String newDiscountCode) {
            this.discountCode = newDiscountCode;
        }

        public String getSize() {
            return this.size;
        }

        public int getNumToppings() {
            return this.numToppings;
        }

        public String getDiscountCode() {
            return this.discountCode;
        }

        public double computeSubtotal() {
            int smallPizza = 5;
            double pizzaCost = 0.0D;
            int medPizza = 7;
            int largePizza = 9;
            int xLargePizza = 12;
            double toppingCost = 0.75D;
            String var9 = this.size;
            byte var10 = -1;
            switch(var9.hashCode()) {
                case 76:
                    if (var9.equals("L")) {
                        var10 = 2;
                    }
                    break;
                case 77:
                    if (var9.equals("M")) {
                        var10 = 1;
                    }
                    break;
                case 83:
                    if (var9.equals("S")) {
                        var10 = 0;
                    }
                    break;
                case 2804:
                    if (var9.equals("XL")) {
                        var10 = 3;
                    }
            }

            switch(var10) {
                case 0:
                    pizzaCost = (double)smallPizza + (double)this.numToppings * toppingCost;
                    break;
                case 1:
                    pizzaCost = (double)medPizza + (double)this.numToppings * toppingCost;
                    break;
                case 2:
                    pizzaCost = (double)largePizza + (double)this.numToppings * toppingCost;
                    break;
                case 3:
                    pizzaCost = (double)xLargePizza + (double)this.numToppings * toppingCost;
                    break;
                default:
                    System.out.println("Invalid Input");
            }

            return pizzaCost;
        }

        public double computeDiscount() {
            double discountReceieved;
            if (this.discountCode.equals("special")) {
                discountReceieved = 3.5D;
            } else if (this.discountCode.equals("payless")) {
                discountReceieved = 4.25D;
            } else {
                discountReceieved = 0.0D;
            }

            return discountReceieved;
        }

        public void printReport() {
            System.out.println(this.getSize());
            System.out.println(this.getNumToppings());
            System.out.println(this.getDiscountCode());
            System.out.println("---------------------------");
            System.out.println(this.computeSubtotal());
            System.out.println(this.computeDiscount());
            System.out.println(this.computeSubtotal() - this.computeDiscount());
        }
    }
