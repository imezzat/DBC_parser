package Generic.DBC_files.SPI;
import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import Generic.DBC_files.*;
public enum SPI_Signals_IP_Msg_0x66 implements SPI_Signal{
FS_I_P_SIG_6("7","+","1","0","0","99","0"),
FS_IP_SIG_9("1","+","1","0","0","1","0"),
FS_ip_siG_5("7","+","1","0","0","99","0"),
FS_IP_SIG_11("1","+","1","0","0","1","0"),
reserved2("4","+","1","0","0","0","0"),
;
private int Bits;
 private boolean Signed_unsigned;
 private double Factor;
 private double Offset;
 private BigDecimal InitVal;
 private BigDecimal Min;
 private BigDecimal Max;
private BigDecimal MinDbc;
 private BigDecimal MaxDbc;
private BigDecimal Bva_Min;
private BigDecimal Bva_Max;
private int precision;
private LinkedHashMap<String,BigDecimal> bva_list;
private static final String MsgName= MethodHandles.lookup().lookupClass().getSimpleName().substring(MethodHandles.lookup().lookupClass().getSimpleName().lastIndexOf("_Signals_")+1);
 SPI_Signals_IP_Msg_0x66(String Bits,String Signed_unsigned,String Factor,String offset,String MinDbc,String MaxDbc,String initialVal){
            init(Bits, Signed_unsigned, Factor, offset, MinDbc, MaxDbc, initialVal);
	}
	@Override
	public int getBits() {
		return Bits;
	}

	@Override
	public double getFactor() {
		return Factor;
	}

	@Override
	public double getOffset() {
		return Offset;
	}

	@Override
	public BigDecimal getInitialVal() {
		return InitVal;
	}

	@Override
	public BigDecimal getMin() {
		return Min;
	}

	@Override
	public BigDecimal getMax() {
		return Max;
	}
	@Override
	public void setMin(final BigDecimal min) {
		Min = min;
	}

	@Override
	public void setMax(final BigDecimal max) {
		Max = max;
	}
	
	@Override
	public void setBva_Min(final BigDecimal bvaMin) {
		Bva_Min = bvaMin;
	}

	@Override
	public void setBva_Max(final BigDecimal bvaMax) {
		Bva_Max = bvaMax;
	}
    
    @Override
	public BigDecimal getBva_Min() {
		return Bva_Min;
	}
    
    @Override
	public BigDecimal getBva_Max() {
		return Bva_Max;
	}

	@Override
	public int getPrecision() {
		return precision;
	}

@Override
	public BigDecimal getMinDbc() {
		return MinDbc;
	}

	@Override
	public void setMinDbc(final String minDbc) {
		MinDbc = new BigDecimal(minDbc);
	}

	@Override
	public BigDecimal getMaxDbc() {
		return MaxDbc;
	}
	@Override
	public void setMaxDbc(final String maxDbc) {
		MaxDbc = new BigDecimal(maxDbc);
		}
    
	@Override
	public void setInitVal(final String initVal) {
		InitVal = new BigDecimal(initVal);

	}
	
	@Override
	public LinkedHashMap<String, BigDecimal> getBva_list() {
		return bva_list;
	}
	@Override
	public boolean isSigned_unsigned() {
		return Signed_unsigned;
	}

	@Override
	public void setSigned_unsigned(final boolean signed_unsigned) {
		Signed_unsigned = signed_unsigned;
	}

	@Override
	public void setBits(final int bits) {
		Bits = bits;
	}

	@Override
	public void setFactor(final double factor) {
		Factor = factor;
	}

	@Override
	public void setOffset(final double offset) {
		Offset = offset;
	}

	@Override
	public void setMinDbc(final BigDecimal minDbc) {
		MinDbc = minDbc;
	}

	@Override
	public void setMaxDbc(final BigDecimal maxDbc) {
		MaxDbc = maxDbc;
	}

	@Override
	public void setPrecision(final int precision) {
		this.precision = precision;
	}

	@Override
	public void setBva_list(final LinkedHashMap<String, BigDecimal> bva_list) {
		this.bva_list = bva_list;
	}
	
	public static String getMsgname() {
		return MsgName;
	}
}