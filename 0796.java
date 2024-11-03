class FirstSolution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.equals(goal)) {
                return true;
            } else {
                s = s.substring(1) + s.charAt(0);
            }
        }
        return false;
    }
}

class SecondSolution {
  public boolean rotateString(String s, String goal) {
    return s.length() == goal.length() && (s + s).contains(goal);
  }
}
