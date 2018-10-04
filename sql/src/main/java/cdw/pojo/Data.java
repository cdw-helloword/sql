package cdw.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Data {
	//单位账号
	private String dwzh;
	//记账日期
	@DateTimeFormat(pattern ="yyyy-MM-dd HH:mm")
	private Date jzrq;
	//发生额
	private Double fse;
	//发生利息额
	private Double fslxe;
	//发生人数
	private Double fsrs;
	//业务明细类型
	private String ywmxlx;
	//汇补缴年月
	private String hbjny;
	//业务流水号
	private String ywlsh;
	//冲账标识
	private String czbz;
	//预留1
	private String yl1;
	//预留2
	private String yl2;
	//建立机构
	private String jljgm;
	//委托机构
	private String wtjgm;
	//记账凭证号
	private String jzpzh;
	//所属年月
	private String ssny;
	//借贷标志
	private String jdbz;
	//余额
	private Double ye;
	//中文摘要
	private String zwzy;
	//记账柜员
	private String jzgy;
	//记账时间
	private String jzsj;
	//原表数据 不知道是啥。。
	private String mxbc;
	private String djhm;
	private String jylx;
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getJylx() {
		return jylx;
	}

	public void setJylx(String jylx) {
		this.jylx = jylx;
	}

	public String getMxbc() {
		return mxbc;
	}

	public void setMxbc(String mxbc) {
		this.mxbc = mxbc;
	}

	public String getDjhm() {
		return djhm;
	}

	public void setDjhm(String djhm) {
		this.djhm = djhm;
	}

	public String getDwzh() {
		return dwzh;
	}
	public void setDwzh(String dwzh) {
		this.dwzh = dwzh;
	}
	public Date getJzrq() {
		return jzrq;
	}
	public void setJzrq(Date jzrq) {
		this.jzrq = jzrq;
	}
	public Double getFse() {
		return fse;
	}
	public void setFse(Double fse) {
		this.fse = fse;
	}
	public Double getFslxe() {
		return fslxe;
	}
	public void setFslxe(Double fslxe) {
		this.fslxe = fslxe;
	}
	public Double getFsrs() {
		return fsrs;
	}
	public void setFsrs(Double fsrs) {
		this.fsrs = fsrs;
	}
	public String getYwmxlx() {
		return ywmxlx;
	}
	public void setYwmxlx(String ywmxlx) {
		this.ywmxlx = ywmxlx;
	}
	public String getHbjny() {
		return hbjny;
	}
	public void setHbjny(String hbjny) {
		this.hbjny = hbjny;
	}
	public String getYwlsh() {
		return ywlsh;
	}
	public void setYwlsh(String ywlsh) {
		this.ywlsh = ywlsh;
	}
	public String getCzbz() {
		return czbz;
	}
	public void setCzbz(String czbz) {
		this.czbz = czbz;
	}
	public String getYl1() {
		return yl1;
	}
	public void setYl1(String yl1) {
		this.yl1 = yl1;
	}
	public String getYl2() {
		return yl2;
	}
	public void setYl2(String yl2) {
		this.yl2 = yl2;
	}
	public String getJljgm() {
		return jljgm;
	}
	public void setJljgm(String jljgm) {
		this.jljgm = jljgm;
	}
	public String getWtjgm() {
		return wtjgm;
	}
	public void setWtjgm(String wtjgm) {
		this.wtjgm = wtjgm;
	}
	public String getJzpzh() {
		return jzpzh;
	}
	public void setJzpzh(String jzpzh) {
		this.jzpzh = jzpzh;
	}
	public String getSsny() {
		return ssny;
	}
	public void setSsny(String ssny) {
		this.ssny = ssny;
	}
	public String getJdbz() {
		return jdbz;
	}
	public void setJdbz(String jdbz) {
		this.jdbz = jdbz;
	}
	public Double getYe() {
		return ye;
	}
	public void setYe(Double ye) {
		this.ye = ye;
	}
	public String getZwzy() {
		return zwzy;
	}
	public void setZwzy(String zwzy) {
		this.zwzy = zwzy;
	}
	public String getJzgy() {
		return jzgy;
	}
	public void setJzgy(String jzgy) {
		this.jzgy = jzgy;
	}
	public String getJzsj() {
		return jzsj;
	}
	public void setJzsj(String jzsj) {
		this.jzsj = jzsj;
	}
	
	
	

}
