Xây dựng 02 lớp thread
Sản xuất - Tiêu thu
Kho K có sức chứa là n sản phẩm, cho phép thiết lập giá trị n khi thực thi
K #1 #2 #n
Viết thủ tục sản xuất ?
Viết thủ tục tiêu thụ ?

Viết hàm maim thức hiện các bước như môt tả ở trên, lặp lại cho đến khi ấn 1 phím thì dừng

Producer: thủ tục sản xuất (Nếu kho K chưa đầy thì tạo 1
sản phẩm thứ X= X+1 và đưa vào kho và thông báo "Sản
xuất sản phẩm #X", ngược lại báo "Kho đầy - ngưng sản
xuất")

Consumer: thủ tục tiêu thụ (Nếu kho K khác rỗng lấy một
sản phẩm x từ kho đi sử dung và thông báo "Tiêu thụ sản
phẩm #X" - loại sản phẩm x khỏi kho; ngược lại, thông
