.class public testProgram
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 50
    .limit locals 100
    new java/util/Scanner
    dup
    getstatic java/lang/System/in Ljava/io/InputStream;
    invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
    astore_1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 105
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 110
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 116
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iconst_0
    istore 2
    iconst_0
    istore 3
    iconst_0
    istore 4
    aload_1
    invokevirtual java/util/Scanner/nextInt()I
    istore 3
    aload_1
    invokevirtual java/util/Scanner/nextInt()I
    istore 4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 3
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 4
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    bipush 1
    istore 5
    bipush 2
    istore 6
    bipush 18
    bipush 2
    bipush 9
    ineg
    imul
    iadd
    istore 3
    iload 3
    istore 4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 5
    iload 6
    imul
    iload 4
    iload 3
    isub
    if_icmpgt L0
    iconst_0
    goto L0r
    L0:
    iconst_1
    L0r:
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 3
    iload 4
    if_icmplt L1
    iconst_0
    goto L1r
    L1:
    iconst_1
    L1r:
    iload 5
    iload 6
    if_icmple L2
    iconst_0
    goto L2r
    L2:
    iconst_1
    L2r:
    iand
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iload 3
    aload_1
    invokevirtual java/util/Scanner/nextInt()I
    istore 4
    iload 4
    if_icmplt L3
    iconst_0
    goto L3r
    L3:
    iconst_1
    L3r:
    iload 5
    iload 6
    if_icmple L4
    iconst_0
    goto L4r
    L4:
    iconst_1
    L4r:
    iand
    pop
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 4
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iload 4
    bipush 10
    iadd
    istore 4
    iload 4
    bipush 5
    iadd
    istore 2
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 98
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 111
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 111
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 108
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iconst_0
    istore 3
    iconst_0
    istore 4
    aload_1
    invokevirtual java/util/Scanner/nextInt()I
    istore 4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 4
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    bipush 12
    bipush 5
    idiv
    bipush 5
    imul
    bipush 12
    bipush 5
    irem
    iadd
    bipush 12
    if_icmpeq L5
    iconst_0
    goto L5r
    L5:
    iconst_1
    L5r:
    bipush 6
    bipush 6
    if_icmpge L6
    iconst_0
    goto L6r
    L6:
    iconst_1
    L6r:
    iand
    istore 4
    bipush 1
    istore 5
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 0
    ifeq L7
    iconst_0
    goto L7r
    L7:
    iconst_1
    L7r:
    iload 4
    iload 5
    if_icmpeq L8
    iconst_0
    goto L8r
    L8:
    iconst_1
    L8r:
    iand
    bipush 1
    bipush 0
    if_icmpne L9
    iconst_0
    goto L9r
    L9:
    iconst_1
    L9r:
    ior
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    bipush 0
    ifeq L7
    iconst_0
    goto L7r
    L7:
    iconst_1
    L7r:
    iload 4
    iload 5
    if_icmpeq L8
    iconst_0
    goto L8r
    L8:
    iconst_1
    L8r:
    iand
    bipush 1
    bipush 0
    if_icmpne L9
    iconst_0
    goto L9r
    L9:
    iconst_1
    L9r:
    ior
    bipush 1
    iand
    istore 3
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 99
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 104
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 97
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 114
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iconst_0
    istore 4
    iconst_0
    istore 5
    iconst_0
    istore 6
    aload_1
    invokevirtual java/util/Scanner/next()Ljava/lang/String;
    iconst_0
    invokevirtual java/lang/String/charAt(I)C
    istore 5
    bipush 99
    istore 7
    bipush 122
    istore 6
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 97
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 5
    iload 7
    if_icmpeq L10
    iconst_0
    goto L10r
    L10:
    iconst_1
    L10r:
    iload 6
    bipush 98
    if_icmpne L11
    iconst_0
    goto L11r
    L11:
    iconst_1
    L11r:
    bipush 1
    ifeq L12
    iconst_0
    goto L12r
    L12:
    iconst_1
    L12r:
    ior
    iand
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    bipush 98
    istore 4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 3
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 4
    invokevirtual java/io/PrintStream/print(C)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    aload_1
    invokevirtual java/util/Scanner/close()V
    return
.end method
Generated: testProgram.class
