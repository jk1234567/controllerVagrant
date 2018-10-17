
#!/bin/bash
while true; do curl http://localhost:8093/fibClientApp/fibClient?fib=23 >/dev/null 2>&1; curl http://localhost:8095/fibClientApp/fibClient?fib=23 >/dev/null 2>&1; done
