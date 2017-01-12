/*
	Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

	Example:
		MovingAverage m = new MovingAverage(3);
		m.next(1) = 1
		m.next(10) = (1 + 10) / 2
		m.next(3) = (1 + 10 + 3) / 3
		m.next(5) = (10 + 3 + 5) / 3

		解题思路， 我们想要O(1)时间，那我们需要一个data struct
		去存储当值多余1个的时候，所以在这里面选择queue，stack应该都是
		可以的

		["MovingAverage","next","next","next","next"]
		[[3],[1],[10],[3],[5]]
		
		MovingAverage 是一开始的initialize，以上面的例子为例，
		当MovingAverage被叫到时，我们得到值是3然后 result是0
		作为起始点。

		然后next, 对应的是每一个value pass in,同时也会把value
		存储到queue里，来keep到底有多少个values需要被加，q.size()
		去update每一次queue增加的size 然后去calculate 他们的average。。。

		这里面需要注意的是， 一开始的init size(ave), 如果 queue.size() >
		ave size, 我们就需要把这个最一开始放进去的value 减出来，然后把它从
		queue里pop掉，然后再做average。

*/

class MovingAverage {
private:
	queue<int> q;
	int ave;    //init size threadhod
	double ret; // return type in double 

public: 
	//initialize data structre here
	MovingAverage(int size): ave(size), ret(0){}

	double next(int val){
		ret += val;
		q.push(val);
		int qSize = qSize.size();

		//check if q is or not less than ave

		if(qSize < ave)
		{
			return ret / qSize;
		}
		else
		{
			//substruct the first value in queue
			ret -= q.front();
			//pop it out from queue for next use
			q.pop(); 
			//size always control by init ave
			return ret / ave;
		}

	}
}；