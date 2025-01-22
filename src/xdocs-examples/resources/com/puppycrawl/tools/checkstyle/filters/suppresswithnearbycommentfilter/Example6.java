/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="SuppressWithNearbyCommentFilter">
      <property name="commentFormat"
        value="@cs\.suppress \[(\w+(\|\w+)*)\] \w[-\.'`,:;\w ]{14,}"/>
      <property name="checkFormat" value="$1"/>
      <property name="influenceFormat" value="1"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.filters.suppresswithnearbycommentfilter;
// xdoc section -- start
public class Example6 {
    // @cs.suppress [ConstantName|NoWhitespaceAfter] A comment here
    public static final int[] array;  // Suppressed violations
}
// xdoc section -- end
