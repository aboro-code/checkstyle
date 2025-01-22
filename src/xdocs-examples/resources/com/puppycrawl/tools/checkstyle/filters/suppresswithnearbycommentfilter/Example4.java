/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="SuppressWithNearbyCommentFilter">
      <property name="commentFormat"
          value="CHECKSTYLE IGNORE (\w+) FOR NEXT (\d+) LINES"/>
      <property name="checkFormat" value="$1"/>
      <property name="influenceFormat" value="$2"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.filters.suppresswithnearbycommentfilter;
// xdoc section -- start
public class Example4 {
    static final int lowerCaseConstant; // CHECKSTYLE IGNORE ConstantNameCheck FOR NEXT 3 LINES
    static final int lowerCaseConstant1;
    static final int lowerCaseConstant2;
    static final int lowerCaseConstant3;
    static final int lowerCaseConstant4; // will warn here
}
// xdoc section -- end
