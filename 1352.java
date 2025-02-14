class ProductOfNumbers {

    List<Integer> numbers;

    public ProductOfNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void add(int num) {
        this.numbers.add(num);
    }

    public int getProduct(int k) {
        int result = 1, size = this.numbers.size();
        for (int i = size - k; i < size; i++) {
            result *= numbers.get(i);
        }
        return result;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

/*
Another Solution:
class ProductOfNumbers {
  public ProductOfNumbers() {
    prefix = new ArrayList<>(List.of(1));
  }

  public void add(int num) {
    if (num == 0)
      prefix = new ArrayList<>(List.of(1));
    else
      prefix.add(prefix.get(prefix.size() - 1) * num);
  }

  public int getProduct(int k) {
    return k >= prefix.size() ? 0
                              : prefix.get(prefix.size() - 1) / prefix.get(prefix.size() - k - 1);
  }

  private List<Integer> prefix = new ArrayList<>();
}
*/
