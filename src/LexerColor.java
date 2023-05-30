

import compilerTools.TextColor;
import java.awt.Color;



@SuppressWarnings("FallThrough")
class LexerColor {

  
  public static final int YYEOF = -1;

  
  private static final int ZZ_BUFFERSIZE = 16384;

  
  public static final int YYINITIAL = 0;

 
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\2\0\1\5\1\6\1\0\1\7\1\0\2\10\1\11"+
    "\1\0\1\10\1\12\1\0\1\13\1\14\11\15\1\0"+
    "\1\10\2\0\1\16\2\0\1\17\1\20\1\21\1\17"+
    "\1\22\7\17\1\23\1\24\1\25\1\26\12\17\4\0"+
    "\1\17\1\0\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\2\17\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\4\17\1\52"+
    "\1\10\1\7\1\10\7\0\1\3\73\0\1\17\7\0"+
    "\1\17\3\0\1\17\3\0\1\17\1\0\1\17\6\0"+
    "\1\17\1\0\1\17\4\0\1\53\7\0\1\17\3\0"+
    "\1\17\3\0\1\17\1\0\1\17\6\0\1\54\1\0"+
    "\1\17\u012b\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       
    int j = offset;  
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\1\1\3\1\4\2\1\2\5"+
    "\16\1\1\0\1\2\2\0\1\6\20\1\1\7\2\1"+
    "\3\0\2\6\20\1\1\10\1\1\2\0\1\6\16\1"+
    "\1\7\1\0\1\1\1\11\2\1\1\12\6\1\1\13"+
    "\1\1\1\0\6\1\1\14\1\1\1\15\1\10\5\1"+
    "\1\16\33\1\1\17\6\1\1\20\2\1\1\21\5\1"+
    "\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\55\0\132\0\207\0\264\0\55\0\55"+
    "\0\341\0\u010e\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c"+
    "\0\u0249\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384"+
    "\0\u03b1\0\u03de\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf\0\u013b"+
    "\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0\0\u05cd\0\u05fa\0\u0627"+
    "\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f"+
    "\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870\0\55\0\u089d\0\u08ca"+
    "\0\u08f7\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\u0a32"+
    "\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d\0\u0195"+
    "\0\u0b9a\0\u0bc7\0\u0bf4\0\u0843\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8"+
    "\0\u0cd5\0\u0d02\0\u0d2f\0\u0d5c\0\u0d89\0\u0db6\0\u0de3\0\u0e10"+
    "\0\u0e3d\0\u0e6a\0\u0195\0\u0e97\0\u0ec4\0\u0195\0\u0ef1\0\u0f1e"+
    "\0\u0195\0\u0f4b\0\u0f78\0\u0fa5\0\u0fd2\0\u0fff\0\u102c\0\u0195"+
    "\0\u1059\0\u1086\0\u10b3\0\u10e0\0\u110d\0\u113a\0\u1167\0\u1194"+
    "\0\u0195\0\u11c1\0\55\0\u110d\0\u11ee\0\u121b\0\u1248\0\u1275"+
    "\0\u12a2\0\u12cf\0\u12fc\0\u1329\0\u1356\0\u1383\0\u13b0\0\u13dd"+
    "\0\u140a\0\u1437\0\u1464\0\u1491\0\u14be\0\u14eb\0\u1518\0\u1545"+
    "\0\u1572\0\u159f\0\u15cc\0\u15f9\0\u1626\0\u1653\0\u1680\0\u16ad"+
    "\0\u16da\0\u1707\0\u1734\0\u1761\0\u178e\0\u0195\0\u17bb\0\u17e8"+
    "\0\u1815\0\u1842\0\u186f\0\u189c\0\u0195\0\u18c9\0\u18f6\0\u0195"+
    "\0\u1923\0\u1950\0\u197d\0\u19aa\0\u19d7\0\u0195";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\2\1\11\1\12\1\13\1\14\1\2\10\15\1\16"+
    "\1\15\1\17\1\20\1\21\1\22\2\15\1\23\1\24"+
    "\1\15\1\25\1\26\1\27\1\15\1\30\1\31\1\32"+
    "\4\15\57\0\1\3\66\0\2\33\1\0\36\33\17\0"+
    "\36\34\12\0\1\35\53\0\1\36\1\0\1\37\55\0"+
    "\2\40\53\0\2\14\53\0\2\15\1\0\36\15\14\0"+
    "\2\15\1\0\13\15\1\41\15\15\1\42\4\15\14\0"+
    "\2\15\1\0\24\15\1\43\11\15\14\0\2\15\1\0"+
    "\14\15\1\44\21\15\14\0\2\15\1\0\30\15\1\45"+
    "\5\15\14\0\2\15\1\0\20\15\1\46\6\15\1\47"+
    "\6\15\14\0\2\15\1\0\23\15\1\50\7\15\1\51"+
    "\2\15\14\0\2\15\1\0\10\15\1\52\25\15\14\0"+
    "\2\15\1\0\24\15\1\53\10\15\1\54\14\0\2\15"+
    "\1\0\14\15\1\21\21\15\14\0\2\15\1\0\20\15"+
    "\1\55\3\15\1\56\11\15\14\0\2\15\1\0\14\15"+
    "\1\57\21\15\14\0\2\15\1\0\20\15\1\60\11\15"+
    "\1\61\3\15\14\0\2\15\1\0\24\15\1\62\11\15"+
    "\14\0\2\63\1\0\36\63\14\0\2\34\1\0\36\34"+
    "\16\0\1\10\36\0\11\64\1\65\43\64\2\37\1\66"+
    "\1\37\1\67\50\37\14\0\2\15\1\0\14\15\1\70"+
    "\21\15\14\0\2\15\1\0\27\15\1\71\6\15\14\0"+
    "\2\15\1\0\21\15\1\72\14\15\14\0\2\15\1\0"+
    "\27\15\1\73\1\15\1\74\4\15\14\0\2\15\1\0"+
    "\31\15\1\75\4\15\14\0\2\15\1\0\23\15\1\76"+
    "\12\15\14\0\2\15\1\0\14\15\1\77\21\15\14\0"+
    "\2\15\1\0\31\15\1\100\4\15\14\0\2\15\1\0"+
    "\26\15\1\101\7\15\14\0\2\15\1\0\23\15\1\102"+
    "\12\15\14\0\2\15\1\0\27\15\1\45\6\15\14\0"+
    "\2\15\1\0\22\15\1\103\13\15\14\0\2\15\1\0"+
    "\23\15\1\104\12\15\14\0\2\15\1\0\23\15\1\105"+
    "\12\15\14\0\2\15\1\0\25\15\1\106\10\15\14\0"+
    "\2\15\1\0\23\15\1\107\12\15\14\0\2\15\1\0"+
    "\27\15\1\110\6\15\14\0\2\15\1\0\22\15\1\111"+
    "\13\15\14\0\2\112\1\0\36\112\11\64\1\113\54\64"+
    "\1\113\1\64\1\114\41\64\2\0\1\66\66\0\2\15"+
    "\1\0\21\15\1\115\14\15\14\0\2\15\1\0\34\15"+
    "\1\116\1\15\14\0\2\15\1\0\24\15\1\117\11\15"+
    "\14\0\2\15\1\0\14\15\1\120\21\15\14\0\2\15"+
    "\1\0\14\15\1\121\21\15\14\0\2\15\1\0\14\15"+
    "\1\110\21\15\14\0\2\15\1\0\10\15\1\122\25\15"+
    "\14\0\2\15\1\0\23\15\1\123\12\15\14\0\2\15"+
    "\1\0\14\15\1\124\21\15\14\0\2\15\1\0\32\15"+
    "\1\125\3\15\14\0\2\15\1\0\33\15\1\126\2\15"+
    "\14\0\2\15\1\0\14\15\1\127\21\15\14\0\2\15"+
    "\1\0\31\15\1\130\4\15\14\0\2\15\1\0\14\15"+
    "\1\131\21\15\14\0\2\15\1\0\14\15\1\132\21\15"+
    "\14\0\2\15\1\0\24\15\1\133\11\15\14\0\2\15"+
    "\1\0\10\15\1\131\25\15\14\0\2\134\1\0\36\134"+
    "\11\64\1\113\1\64\1\66\41\64\14\0\2\15\1\0"+
    "\10\15\1\135\25\15\14\0\2\15\1\0\30\15\1\110"+
    "\5\15\14\0\2\15\1\0\27\15\1\136\6\15\14\0"+
    "\2\15\1\0\12\15\1\137\23\15\14\0\2\15\1\0"+
    "\23\15\1\140\12\15\14\0\2\15\1\0\21\15\1\141"+
    "\14\15\14\0\2\15\1\0\31\15\1\142\4\15\14\0"+
    "\2\15\1\0\27\15\1\143\6\15\14\0\2\15\1\0"+
    "\20\15\1\144\15\15\14\0\2\15\1\0\10\15\1\145"+
    "\25\15\14\0\2\15\1\0\27\15\1\146\6\15\14\0"+
    "\2\15\1\0\10\15\1\147\25\15\14\0\2\15\1\0"+
    "\27\15\1\150\6\15\14\0\2\15\1\0\31\15\1\151"+
    "\4\15\14\0\2\152\1\0\36\152\14\0\2\15\1\0"+
    "\23\15\1\45\12\15\14\0\2\15\1\0\17\15\1\153"+
    "\16\15\14\0\2\15\1\0\14\15\1\154\21\15\14\0"+
    "\2\15\1\0\14\15\1\155\21\15\14\0\2\15\1\0"+
    "\27\15\1\156\6\15\14\0\2\15\1\0\14\15\1\157"+
    "\21\15\14\0\2\15\1\0\27\15\1\160\6\15\14\0"+
    "\2\15\1\0\24\15\1\136\11\15\14\0\2\15\1\0"+
    "\27\15\1\161\6\15\14\0\2\15\1\0\20\15\1\162"+
    "\15\15\14\0\2\163\1\0\36\163\14\0\2\15\1\0"+
    "\10\15\1\164\25\15\14\0\2\15\1\0\27\15\1\165"+
    "\6\15\14\0\2\15\1\0\3\15\1\166\32\15\14\0"+
    "\2\15\1\0\32\15\1\167\3\15\14\0\2\15\1\0"+
    "\27\15\1\170\6\15\14\0\2\15\1\0\4\15\1\171"+
    "\31\15\14\0\2\15\1\0\27\15\1\172\6\15\14\0"+
    "\2\15\1\0\7\15\1\173\26\15\14\0\2\15\1\0"+
    "\30\15\1\174\5\15\14\0\2\15\1\0\22\15\1\175"+
    "\13\15\14\0\2\15\1\0\13\15\1\153\22\15\14\0"+
    "\2\15\1\0\24\15\1\176\11\15\14\0\2\15\1\0"+
    "\4\15\1\177\31\15\14\0\2\15\1\0\20\15\1\200"+
    "\15\15\14\0\2\15\1\0\1\15\1\201\1\202\2\15"+
    "\1\203\1\204\27\15\14\0\2\15\1\0\25\15\1\205"+
    "\10\15\14\0\2\15\1\0\23\15\1\206\12\15\14\0"+
    "\2\15\1\0\20\15\1\207\15\15\14\0\2\15\1\0"+
    "\23\15\1\210\12\15\14\0\2\15\1\0\10\15\1\211"+
    "\10\15\1\212\14\15\14\0\2\15\1\0\21\15\1\213"+
    "\14\15\14\0\2\15\1\0\14\15\1\214\21\15\14\0"+
    "\2\15\1\0\11\15\1\215\24\15\14\0\2\15\1\0"+
    "\20\15\1\216\15\15\14\0\2\15\1\0\14\15\1\217"+
    "\21\15\14\0\2\15\1\0\14\15\1\220\21\15\14\0"+
    "\2\15\1\0\31\15\1\221\4\15\14\0\2\15\1\0"+
    "\21\15\1\222\14\15\14\0\2\15\1\0\10\15\1\223"+
    "\25\15\14\0\2\15\1\0\10\15\1\224\25\15\14\0"+
    "\2\15\1\0\16\15\1\224\17\15\14\0\2\15\1\0"+
    "\30\15\1\225\5\15\14\0\2\15\1\0\27\15\1\226"+
    "\6\15\14\0\2\15\1\0\13\15\1\227\22\15\14\0"+
    "\2\15\1\0\23\15\1\230\12\15\14\0\2\15\1\0"+
    "\10\15\1\216\25\15\14\0\2\15\1\0\20\15\1\231"+
    "\15\15\14\0\2\15\1\0\23\15\1\232\12\15\14\0"+
    "\2\15\1\0\27\15\1\233\6\15\14\0\2\15\1\0"+
    "\31\15\1\234\4\15\14\0\2\15\1\0\10\15\1\235"+
    "\25\15\14\0\2\15\1\0\31\15\1\236\4\15\14\0"+
    "\2\15\1\0\33\15\1\237\2\15\14\0\2\15\1\0"+
    "\12\15\1\233\23\15\14\0\2\15\1\0\24\15\1\240"+
    "\11\15\14\0\2\15\1\0\34\15\1\241\1\15\14\0"+
    "\2\15\1\0\27\15\1\242\6\15\14\0\2\15\1\0"+
    "\10\15\1\240\25\15\14\0\2\15\1\0\12\15\1\243"+
    "\23\15\14\0\2\15\1\0\10\15\1\244\25\15\14\0"+
    "\2\15\1\0\32\15\1\245\3\15\14\0\2\15\1\0"+
    "\30\15\1\246\5\15\14\0\2\15\1\0\21\15\1\233"+
    "\14\15";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6660];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\2\11\22\1\1\0\1\1\2\0"+
    "\24\1\3\0\1\11\23\1\2\0\20\1\1\0\15\1"+
    "\1\0\10\1\1\11\63\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TextColor yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* Ignorar */
            }
            // fall through
          case 18: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 19: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(46, 125, 50));
            }
            // fall through
          case 20: break;
          case 4:
            { return textColor(yychar, yylength(), new Color(169, 155, 179));
            }
            // fall through
          case 21: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(35, 120, 147));
            }
            // fall through
          case 22: break;
          case 6:
            { return textColor(yychar, yylength(), new Color(146, 146, 146));
            }
            // fall through
          case 23: break;
          case 7:
            { return textColor(yychar, yylength(), new Color(48, 63, 159));
            }
            // fall through
          case 24: break;
          case 8:
            { return textColor(yychar, yylength(), new Color(17, 94, 153));
            }
            // fall through
          case 25: break;
          case 9:
            { return textColor(yychar, yylength(), new Color(148, 58, 173));
            }
            // fall through
          case 26: break;
          case 10:
            { return textColor(yychar, yylength(), new Color(198, 40, 40));
            }
            // fall through
          case 27: break;
          case 11:
            { return textColor(yychar, yylength(), new Color(102, 41, 120));
            }
            // fall through
          case 28: break;
          case 12:
            { return textColor(yychar, yylength(), new Color(212, 129, 6));
            }
            // fall through
          case 29: break;
          case 13:
            { return textColor(yychar, yylength(), new Color(224, 195, 12));
            }
            // fall through
          case 30: break;
          case 14:
            { return textColor(yychar, yylength(), new Color(121, 107, 255));
            }
            // fall through
          case 31: break;
          case 15:
            { return textColor(yychar, yylength(), new Color(255, 64, 129));
            }
            // fall through
          case 32: break;
          case 16:
            { return textColor(yychar, yylength(), new Color(239, 108, 0));
            }
            // fall through
          case 33: break;
          case 17:
            { return textColor(yychar, yylength(), new Color(150, 0, 80));
            }
            // fall through
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
