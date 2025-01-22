/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="SuppressWithNearbyCommentFilter">
      <property name="commentFormat" value="@cs-\: ([\w\|]+) influence (\d+)"/>
      <property name="checkFormat" value="$1"/>
      <property name="influenceFormat" value="$2"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.filters.suppresswithnearbycommentfilter;
// xdoc section -- start
// @cs-: ClassDataAbstractionCoupling influence 2
// @cs-: MagicNumber influence 4
public class Example8 {
    @Service // no violations from ClassDataAbstractionCoupling here
    @Transactional
    public class UserService {
        private int value = 10022; // no violations from MagicNumber here
    }
}
// xdoc section -- end
