package com.module.person;

import com.module.support.NullCheker;
import com.module.support.StringEmptyChecker;

import lombok.Data;

@Data
public class Jyusho {

	private Todofuken todofuken;

	private String shikutyoson;

	private String bantiTatemono;

	/**
	 * 完全一致
	 * propatyが全て一致している場合trueを返す
	 * ただし,NullとEmptyが含まれていた場合は同じではない
	 * TODO 市区町村と番地建物はオブジェクトで持たせる　数値を半角全角は同じであると判定するようにしたい
	 * @param jyusho
	 * @return 全てに値があり、なおかつ、一致しているとき同じ住所であると判定する
	 */
	public boolean fullMatch(Jyusho jyusho) {
		StringEmptyChecker s = new StringEmptyChecker();
		if (s.containEmpty(this.shikutyoson, this.bantiTatemono, jyusho.shikutyoson, jyusho.bantiTatemono)) {
			return false;
		}
		NullCheker nullDeci = new NullCheker();
		if (nullDeci.containNull(this.todofuken, jyusho.todofuken)) {
			return false;
		}
		if (this.todofuken != jyusho.todofuken) {
			return false;
		}
		if(!this.shikutyoson.equals(jyusho.shikutyoson)){
			return false;
		}
		return this.bantiTatemono.equals(jyusho.bantiTatemono);
	}
}
