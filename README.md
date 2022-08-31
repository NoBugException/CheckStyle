
checkStyle官方文档：
https://checkstyle.org/checks.html

1、AbbreviationAsWordInName（连续大写字母名称）

2、AbstractClassName（抽象类名称命名模式）

3、AnnotationLocation	检查注解在语言元素上的位置。

4、AnnotationOnSameLine	检查注解是否与其目标位于同一行上。

5、AnnotationUseStyle	检查注解中元素的样式。

6、AnonInnerLength	检查长匿名内部类，指定匿名内部类的最大行数，默认值：10

7、ArrayTrailingComma	检查数组初始化是否包含尾随逗号。

8、ArrayTypeStyle	检查数组类型定义的样式。默认为Java样式，可以指定为C样式 

9、AtclauseOrder	检查 javadoc 块标签或 javadoc 标签的顺序。

10、AvoidDoubleBraceInitialization	检测双大括号初始化。

11、AvoidEscapedUnicodeCharacters	限制使用 Unicode 转义（如 \u221e）。

12、AvoidInlineConditionals	检测内联条件。

13、AvoidNestedBlocks	查找嵌套块（在代码中自由使用的块）。

14、AvoidNoArgumentSuperConstructorCall	检查是否存在对不带参数的超类构造函数的调用。

15、AvoidStarImport	检查是否存在使用 * 表示法的导入语句。

16、AvoidStaticImport	检查是否没有静态导入语句。

17、BooleanExpressionComplexity	限制表达式中布尔运算符（&&、||、&、|和 ^）的数量。

18、CatchParameterName	检查参数名称是否符合指定的模式。catch

19、ClassDataAbstractionCoupling	测量给定类或记录中其他类的实例化数。

20、ClassFanOutComplexity	检查给定类/记录/接口/枚举/注释所依赖的其他类型的数量。

21、ClassMemberImpliedModifier	检查类和记录中嵌套类型的隐式修饰符。

22、ClassTypeParameterName	检查类类型参数名称是否符合指定的模式。

23、CommentsIndentation	控制注释和周围代码之间的缩进。

24、ConstantName	检查常量名称是否符合指定的模式。

25、CovariantEquals	检查定义协变方法的类和记录是否也覆盖方法 。equals()equals(Object)

26、CustomImportOrder	检查导入声明组是否按用户指定的顺序显示。

27、CyclomaticComplexity	根据指定的限制检查循环复杂度。

28、DeclarationOrder	检查类、记录或接口声明的各个部分是否按照 Java 编程语言的代码约定建议的顺序出现。

29、DefaultComesLast	检查 语句中的所有 s 之后是否为 。defaultcaseswitch

30、DescendantToken	检查其他令牌下的受限制令牌。

31、DesignForExtension	检查类是否为扩展而设计（创建子类）。

32、EmptyBlock	检查空块。

33、EmptyCatchBlock	检查空的捕获块。

34、EmptyForInitializerPad	检查初始值设定项的空填充;也就是说，初始值设定项的空处是否需要空格，或者禁止使用这样的空格。

35、EmptyForIteratorPad	检查迭代器的空填充;也就是说，迭代器的空处是否需要空格，或者禁止这样的空格。

36、EmptyLineSeparator	在包、所有导入声明、字段、构造函数、方法、嵌套类、静态初始值设定项和实例初始值设定项之前检查空行分隔符。

37、EmptyStatement	检测空语句（独立分号）。";"

38、EqualsAvoidNull	检查 String 文本的任意组合是否位于 equals（） 比较的左侧。

39、EqualsHashCode	检查重写或同时重写另一个类的类。equals()hashCode()

40、ExecutableStatementCount	将可执行语句的数量限制在指定的限制内。

41、ExplicitInitialization	检查是否有任何类或对象成员已显式初始化为其类型值的默认值（对于对象引用，对于数值类型为零，对于和 。nullcharfalseboolean

42、FallThrough	检查开关语句中的漏关。

43、FileLength	检查长源文件。

44、FileTabCharacter	检查源代码中是否没有制表符 （'\t'）。

45、FinalClass	检查仅具有私有构造函数且没有后代类的类是否被声明为 final。

46、FinalLocalVariable	检查从未更改其值的局部变量是否被声明为 final。

47、FinalParameters	检查方法、构造函数、捕获和 for-each 块的参数是否为最终参数。

48、GenericWhitespace	检查通用标记（尖括号）“<”和“>”周围的空格是否符合典型约定。

49、Header	检查源文件是否以指定的标头开头。

50、HiddenField	检查局部变量或参数是否不隐藏在同一类中定义的字段。

51、HideUtilityClassConstructor	确保实用程序类（在其 API 中仅包含静态方法或字段的类）没有公共构造函数。

52、IllegalCatch	检查某些异常类型是否未出现在 catch 语句中。

53、IllegalIdentifierName	使用模式检查一组非法名称的标识符，例如受限制的名称或上下文关键字。

54、IllegalImport	检查从一组非法包导入。

55、IllegalInstantiation	检查首选工厂方法的非法实例化。

56、IllegalThrows	未声明要引发指定类型的检查。

57、IllegalToken	检查非法令牌。

58、IllegalTokenText	检查指定的标记文本是否与非法模式匹配。

59、IllegalTokenText	检查是否从未使用过特定的类或接口。

60、ImportControl	控制每个包和文件中可以导入的内容。

61、ImportOrder	检查导入的顺序/分组。

62、Indentation	检查 Java 代码的正确缩进。

63、InnerAssignment	检查子表达式中的赋值，例如 在 中。String s = Integer.toString(i = 2);

64、InnerTypeLast	检查嵌套（内部）类/接口在所有初始化和静态初始化块、方法、构造函数和字段声明之后，在主（顶级）类的底部声明。

65、InterfaceIsType 	实现 Joshua Bloch，Effective Java，Item 17 - 仅使用接口来定义类型。

66、InterfaceMemberImpliedModifier	检查接口成员和嵌套类型上的隐式修饰符。

67、InterfaceTypeParameterName	检查接口类型参数名称是否符合指定的模式。

68、InvalidJavadocPosition	检查 Javadocs 是否位于正确的位置。

69、JavadocBlockTagLocation	检查 javadoc 块标记是否仅出现在行的开头，忽略前导星号和空格。

70、JavadocContentLocation	检查项目中所有 Javadoc 注释的 Javadoc 内容是否从同一位置开始。

71、JavadocMethod	检查方法或构造函数的 Javadoc。

72、JavadocMissingLeadingAsterisk	检查 javadoc 每行上是否有前导星号。

73、JavadocMissingWhitespaceAfterAsterisk	检查前导星号后面是否至少有一个空格。

74、JavadocPackage	检查每个 Java 包是否有一个用于注释的 Javadoc 文件。

75、JavadocParagraph	检查 Javadoc 段落。

76、JavadocStyle	验证 Javadoc 注释以帮助确保它们的格式正确。

77、JavadocTagContinuationIndentation	检查块标签中延续线的缩进。

78、JavadocType	检查 Javadoc 注释中的类型定义。

79、JavadocVariable	检查变量是否具有 Javadoc 注释。

80、JavaNCSS	通过计算非注释源语句 （NCSS） 来确定方法、类和文件的复杂性。

81、LambdaBodyLength	检查 lambda 主体长度。

82、LambdaParameterName	检查 lambda 参数名称。

83、LeftCurly	检查代码块左大括号 （） 的位置。'{'

84、LineLength	检查长线。

85、LocalFinalVariableName	检查局部最终变量名称是否符合指定的模式。

86、LocalVariableName	检查局部非最终变量名称是否符合指定的模式。

87、MagicNumber	检查是否存在“幻数”，其中幻数是未定义为常量的数字文本。

88、MatchXpath	评估 Xpath 查询并报告所有匹配的 AST 节点上的冲突。

89、MatchXpath	检查实例变量名称是否符合指定的模式。

90、MatchXpath	通过访问修饰符或总数检查每个类型声明中声明的方法数。

91、MethodLength	检查长方法和构造函数。

92、MethodName	检查方法名称是否符合指定的模式。

93、MethodParamPad	检查方法定义、构造函数定义、方法调用或构造函数调用的标识符之间的填充;和参数列表的左括号。

94、MethodTypeParameterName	检查方法类型参数名称是否符合指定的模式。

95、MissingCtor	检查类（抽象类除外）是否定义了构造函数，并且不依赖于默认构造函数。

96、MissingDeprecated	验证当注解和 Javadoc 标记中的任何一个都存在时，它们是否都存在。@Deprecated@deprecated

97、MissingJavadocMethod	检查方法或构造函数中缺少的 Javadoc 注释。

98、MissingJavadocPackage	检查包信息.java文件中是否缺少 Javadoc 注释。

99、MissingJavadocType	检查类、枚举、接口和注释接口定义中缺少的 Javadoc 注释。

100、MissingOverride	验证当 javadoc 标记存在时注释是否存在。@Override@inheritDoc

101、MissingSwitchDefault	检查 switch 语句是否具有子句。default

102、ModifiedControlVariable	检查 for 循环控制变量是否未在 for 块内进行修改。

103、ModifierOrder	检查修饰符的顺序是否符合 Java 语言规范 § 8.1.1、8.3.1、8.4.3 和 9.4 中的建议。

104、MultipleStringLiterals	检查单个文件中同一字符串文本的多次出现。

105、MultipleVariableDeclarations	检查每个变量声明是否在其自己的语句中，是否在其自己的行中。

106、MutableException	确保异常类（名称符合某种模式的类，以及显式扩展名称符合其他模式的类）是不可变的，也就是说，它们只有最终字段。

107、NeedBraces	检查代码块周围的大括号。

108、NestedForDepth	将嵌套块限制在指定的深度。for

109、NestedIfDepth	将嵌套的 if-else 块限制在指定的深度。

110、NestedTryDepth	将嵌套的 try-catch-final 块限制在指定的深度。

111、NewlineAtEndOfFile	检查文件是否以换行符结尾。

112、NoArrayTrailingComma	检查数组初始化是否不包含尾随逗号。

113、NoClone	检查克隆方法是否未从 Object 类中重写。

114、NoCodeInFile	检查文件是否包含代码。

115、NoFinalizer	检查是否存在参数为零的方法。finalize

116、NoLineWrap	检查所选语句是否未换行。

117、NonEmptyAtclauseDescription	检查块标记后跟描述。

118、NoEnumTrailingComma	检查枚举定义是否不包含尾随逗号。

119、NoWhitespaceAfter	检查令牌后面是否没有空格。

120、NoWhitespaceBefore	检查令牌前是否没有空格。

121、NoWhitespaceBeforeCaseDefaultColon	检查开关块中冒号前是否没有空格。

122、NPathComplexity	根据指定的限制检查 NPATH 复杂性。

123、OneStatementPerLine	检查每行是否只有一条语句。

124、OneTopLevelClass	检查每个顶级类、接口、枚举或注释是否驻留在自己的源文件中。

125、OperatorWrap	检查有关如何在运算符上换行的策略。

126、OrderedProperties	检测属性文件中的键是否按正确的顺序排列。

127、OuterTypeFilename	检查外部类型名称和文件名是否匹配。

128、OuterTypeNumber	检查文件中在外部（或根）级别声明的类型数。

129、OverloadMethodsDeclarationOrder	检查重载方法是否组合在一起。

130、OverloadMethodsDeclarationOrder	检查所有包批注是否都在包信息.java文件中。

131、PackageDeclaration	确保类具有包声明，以及（可选）包名称是否与源文件的目录名称匹配。

132、PackageName	检查包名称是否符合指定的模式。

133、ParameterAssignment	不允许分配参数。

134、ParameterName	检查方法参数名称是否符合指定的模式。

135、ParameterNumber	检查方法或构造函数的参数数。

134、ParenPad	检查括号填充的策略;也就是说，在左括号之后和右括号之前是否需要空格，或者禁止使用这样的空格。

135、PatternVariableName	检查模式变量名称是否符合指定的模式。

136、RecordComponentNumber	检查记录定义标头中的记录组件数。

137、RecordComponentName	检查记录组件名称是否符合指定的模式。

138、RecordTypeParameterName	检查记录类型参数名称是否符合指定的模式。

139、RedundantImport	检查冗余导入语句。

140、RedundantModifier	检查冗余修饰符。

141、Regexp	检查指定的模式是否存在、是否存在于设定的次数或文件中是否存在。

142、RegexpHeader	根据包含源标头每行模式的标头检查源文件的标头。

143、RegexpMultiline	检查指定的模式是否在任何文件类型中的多行之间匹配。

144、RegexpOnFilename	根据文件和/或文件夹路径检查指定的模式是否匹配。

145、RegexpSingleline	检查指定的模式是否与任何文件类型中的单行匹配。

146、RegexpSinglelineJava	检查指定的模式是否与 Java 文件中的单行匹配。

147、RequireThis	检查对当前对象的实例变量和方法的引用是否显式采用“this.varName”或“this.methodName（args）”的形式，以及当“this.”不存在时，这些引用是否不依赖于默认行为。

148、ReturnCount	限制方法、构造函数和 lambda 表达式中返回语句的数量。

149、RightCurly	检查代码块右大括号 （） 的位置。'}'

150、SeparatorWrap	使用分隔符检查换行。

151、SimplifyBooleanExpression	检查过于复杂的布尔表达式。

152、SimplifyBooleanReturn	检查过于复杂的布尔返回语句。

153、SingleLineJavadoc	检查 Javadoc 块是否可以放在单行中，并且不包含块标记。

154、RequireEmptyLineBeforeBlockTagGroup	检查块标记前面的一个空行（如果它存在于 Javadoc 中）。

155、SingleSpaceSeparator	检查非空格字符之间的空格是否不超过一个空格。

156、StaticVariableName	检查 非变量名称是否符合指定的模式。staticfinal

157、StringLiteralEquality	检查字符串文本是否不与 或 一起使用。==!=

158、StringLiteralEquality	检查 Javadoc 摘要句子是否不包含不建议使用的短语。

159、SuperClone	检查重写的 clone（） 方法是否调用 super.clone（）。

160、SuperFinalize	检查重写 finalize（） 方法是否调用 super.finalize（）。

161、SuppressWarnings	允许指定不允许禁止显示的警告。@SuppressWarnings

162、ThrowsCount	将引发语句限制为指定的计数。

163、TodoComment	检查待办事项：注释。

164、TrailingComment	用于确保包含代码的行不以注释结尾的检查。

165、Translation	通过检查属性文件在其键上的一致性，确保代码的正确转换。

166、TypecastParenPad	检查有关类型转换的括号填充的策略。

167、TypeName	检查类型名称是否符合指定的模式。

168、UncommentedMain	检测未注释的方法。main

169、UniqueProperties	检测属性文件中的重复键。

170、UnnecessaryParentheses	检查语句或表达式中是否使用了不必要的括号。

171、UnnecessarySemicolonInEnumeration	检查枚举定义中是否有不必要的分号。

172、UnnecessarySemicolonInTryWithResources	检查上次资源声明中是否使用了不必要的分号。

173、UnnecessarySemicolonAfterOuterTypeDeclaration	检查类型声明后是否使用了不必要的分号。

174、nnecessarySemicolonAfterTypeMemberDeclaration	检查类型成员声明后是否使用了不必要的分号。

175、UnusedImports	检查未使用的导入语句。

176、UpperEll	检查长常量是否使用上 ell 定义。

177、UnusedLocalVariable	检查局部变量是否已声明和/或赋值，但未使用。

178、VariableDeclarationUsageDistance	检查变量声明与其首次使用之间的距离。

179、VisibilityModifier	检查类成员的可见性。

180、WhitespaceAfter	检查令牌后跟空格，但不会检查迭代器空分号后面的空格。

181、WhitespaceAround	检查令牌是否被空格包围。

182、WriteTag	要求用户定义的 Javadoc 标记以定义的格式出现在 Javadoc 注释中。
