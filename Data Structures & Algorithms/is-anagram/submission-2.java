class Solution {
    public boolean isAnagram(String s, String t) {
      char[] sSort = s.toCharArray();
      char[] tSort = t.toCharArray();
      Arrays.sort(sSort);
      Arrays.sort(tSort);
      s = new String(sSort);
      t = new String(tSort);
      if(s.equals(t)) return true;
      return false;
    }
}
