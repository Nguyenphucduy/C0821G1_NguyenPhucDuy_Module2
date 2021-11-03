package l21_behavioral_design_pattern.demo.strategy;

import java.util.List;

public interface SortStrategy {

	<T> void sort(List<T> items);
}
