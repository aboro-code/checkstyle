/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="SuppressWithNearbyCommentFilter">
      <property name="commentFormat" value="OK to catch (\w+) here"/>
      <property name="checkFormat" value="IllegalCatchCheck"/>
      <property name="messageFormat" value="$1"/>
      <property name="influenceFormat" value="-1"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.filters.suppresswithnearbycommentfilter;
// xdoc section -- start
public class Example3 {
    public void test() {
        try {
            // some code here
        }
        catch (RuntimeException re) {
            // OK to catch RuntimeException here
        }
        catch (Throwable th) {
            // This violation is NOT suppressed
        }
    }
}
// xdoc section -- end
