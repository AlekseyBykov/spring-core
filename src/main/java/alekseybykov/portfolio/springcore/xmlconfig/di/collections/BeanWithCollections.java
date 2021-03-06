package alekseybykov.portfolio.springcore.xmlconfig.di.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Aleksey Bykov
 * @since 25.08.2020
 */
public class BeanWithCollections {

	private List<String> list;

	private Set<String> set;

	private Set<String> yetAnotherSet;

	private Map<String, String> map;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Set<String> getYetAnotherSet() {
		return yetAnotherSet;
	}

	public void setYetAnotherSet(Set<String> yetAnotherSet) {
		this.yetAnotherSet = yetAnotherSet;
	}
}
